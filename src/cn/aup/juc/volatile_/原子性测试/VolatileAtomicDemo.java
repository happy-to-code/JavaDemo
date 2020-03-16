package cn.aup.juc.volatile_.原子性测试;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Describle:测试Volatile的非原子性
 * @Author: zhangyifei
 * @Date: 2020/3/2
 */
public class VolatileAtomicDemo {

    /**
     * 此处已经用Volatile修饰
     */
    volatile int data = 0;
    /**
     * 有原子类解决原子性操作
     * atomicInteger 初始值为0
     */
    AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        VolatileAtomicDemo myData = new VolatileAtomicDemo();
        // 此处创建20个线程，每个线程调用addPlusPlus方法1000次，看最后的结果是否为20000
        for (int i = 0; i < 20; i++) {
            new Thread(String.valueOf(i)) {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        myData.addPlusPlus();
                        myData.addMyAtomic();
                    }
                }
            }.start();
        }

        // 等待上面的线程计算完成
        // 此处为什么是2？因为main方法和GC都要占用一个线程
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }

        // 打印最终的值
        System.out.println(Thread.currentThread().getName() + "普通类型的: " + myData.data);
        System.out.println(Thread.currentThread().getName() + "原子类型的: " + myData.atomicInteger);
    }

    /**
     * data++:其实分为3步操作：
     * 1、从内存中读取值
     * 2、进行+1操作
     * 3、将值重写写到内存
     * 但是在多线程环境中，有可能是线程A进行了一次+1操作，正当他想往主内存中写入，但是此时他被挂起了，
     * 然后线程B将自己的值写到主内存中，然后线程A又被唤醒，他将自己的值覆盖了了主内存的值，此时就出错了
     * 此处如何保证原子性？可以加锁，用synchronized修饰
     */
    private /*synchronized*/ void addPlusPlus() {
        data++;
    }

    /**
     * 这一步相当于i++
     */
    private void addMyAtomic() {
        atomicInteger.getAndAdd(1);
    }


}
