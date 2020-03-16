package cn.aup.juc.生产者消费者.three;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Describle:阻塞队列版本生产消费者
 * @Author: zhangyifei
 * @Date: 2020/3/6 22:43
 */
class MyResource {
    // 用Volatile修饰，让其都可见
    private volatile boolean FLAG = true;

    // 原子性
    private AtomicInteger atomicInteger = new AtomicInteger();

    private BlockingQueue<String> blockingQueue;

    // 阻塞队列
    public MyResource(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
        System.out.println("次阻塞队列的名称：" + blockingQueue.getClass().getName());
    }

    public void myProd() throws InterruptedException {
        String data;
        boolean retResult;
        // 只要次标志是true就一直生产
        while (FLAG) {
            data = atomicInteger.incrementAndGet() + "";
            // 2秒钟放一个结果到阻塞队列里
            retResult = blockingQueue.offer(data, 2L, TimeUnit.SECONDS);
            if (retResult) {
                System.out.println(Thread.currentThread().getName() + "\t" + data + "生产了一个数据");
            } else {
                System.out.println(Thread.currentThread().getName() + "\t" + data + "生产了数据失败。。。。");
            }
            Thread.sleep(1000);
        }

        //  此处FLAG一定是false
        System.out.println(Thread.currentThread().getName() + "\t 老板 让停止生产了数据===============================");

    }

    public void myConsume() throws InterruptedException {
        String result;
        while (FLAG) {
            result = blockingQueue.poll(2L, TimeUnit.SECONDS);

            if (null == result || result.equalsIgnoreCase("")) {
                FLAG = false;
                System.out.println(Thread.currentThread().getName() + "\t 2秒钟未取到数据，消费者退出》》》》》");
                System.out.println();
                return;
            }

            System.out.println(Thread.currentThread().getName() + "\t" + "【【【【消费了一个数据】】】】");
        }
    }

    public void stop() {
        FLAG = false;
    }

}

public class ProdConsume_BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        MyResource myResource = new MyResource(new ArrayBlockingQueue<>(10));

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "=============================生产者生产=============================");
            try {
                myResource.myProd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "生产者").start();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "=============================消费者消费================================");
            try {
                myResource.myConsume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "消费者").start();

        // 主线程睡眠5秒钟
        TimeUnit.SECONDS.sleep(5);

        // 调用停止方法
        myResource.stop();
    }
}
