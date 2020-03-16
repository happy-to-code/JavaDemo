package cn.aup.juc.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Describle:ReentrantLock也是可重入锁（递归锁），即方法外部获取到了锁，那么就获得了整个方法的锁
 * @Author: zhangyifei
 * @Date: 2020/3/4 22:23
 */
class Phone2 implements Runnable {

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        get();
    }

    private void get() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getId() + "\t get()");
            set();
        } finally {
            lock.unlock();
        }
    }

    private void set() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getId() + "\t ####set()");
        } finally {
            lock.unlock();
        }
    }
}

public class ReenterLockDemo2 {
    public static void main(String[] args) {
        Phone2 phone2 = new Phone2();

        Thread t1 = new Thread(phone2, "t1");
        Thread t2 = new Thread(phone2, "t2");

        t1.start();
        t2.start();
    }
}
