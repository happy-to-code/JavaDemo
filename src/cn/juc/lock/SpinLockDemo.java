package cn.juc.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Describle:自旋锁demo
 * @Author: zhangyifei
 * @Date: 2020/3/4 23:15
 */
public class SpinLockDemo {
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    /**
     * 自己实现自旋锁--上锁
     */
    public void myLock() {
        // 获取线程
        Thread thread = Thread.currentThread();
        System.out.println("thread = " + thread.getName() + "\t 进来了……");
        // 这边是自旋的操作 如果except没有线程，那么就将自己的线程给它--> 然后成功了  取反就跳出了
        while (!atomicReference.compareAndSet(null, thread)) {
        }
    }

    /**
     * 自己实现自旋锁--解锁
     */
    public void myUnLock() {
        // 获取线程
        Thread thread = Thread.currentThread();
        System.out.println("thread = " + thread.getName() + "\t 释放锁。。。。。。。");
        // 将当前线程置为空
        atomicReference.compareAndSet(thread, null);
    }

    public static void main(String[] args) {
        SpinLockDemo spinLockDemo = new SpinLockDemo();

        new Thread(() -> {
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.myUnLock();
        }, "t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.myUnLock();
        }, "t2").start();
    }

}
