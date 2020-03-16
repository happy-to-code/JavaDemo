package cn.aup.juc.list高级;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Describle:不存储元素的阻塞队列，也即单个元素的队列
 * @Author: zhangyifei
 * @Date: 2020/3/5 23:31
 */
public class SynchronizedQueueDemo {
    public static void main(String[] args) {

        BlockingQueue<String> blockingQueue = new SynchronousQueue<>();

        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "\t put 1");
                blockingQueue.put("1");

                // &&&&**在这边是放不进去的，因为这个阻塞队列只能放一个，只有消费掉了才能放
                System.out.println(Thread.currentThread().getName() + "\t put 2");
                blockingQueue.put("2");

                // &&&&**在这边是放不进去的，因为这个阻塞队列只能放一个，只有消费掉了才能放
                System.out.println(Thread.currentThread().getName() + "\t put 3");
                blockingQueue.put("3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AAA").start();

        new Thread(() -> {
            try {
                try {
                    // 这边睡3秒钟====只有这边被消费了才能取
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "\t" + blockingQueue.take());

                try {
                    // 这边睡3秒钟
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "\t" + blockingQueue.take());

                try {
                    // 这边睡3秒钟
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "\t" + blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "BBBB").start();
    }
}
