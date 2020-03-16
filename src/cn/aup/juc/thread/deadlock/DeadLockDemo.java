package cn.aup.juc.thread.deadlock;

import java.util.concurrent.TimeUnit;

/**
 * @Describle:死锁
 * @Author: zhangyifei
 * @Date: 2020/3/7 16:16
 */
class MyDeadLock implements Runnable {
    private String lockA;
    private String lockB;

    public MyDeadLock(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + "\t 自己获得" + lockA + "尝试获取" + lockB);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "\t 自己获得" + lockB + "尝试获取" + lockA);
            }
        }


    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";

        new Thread(new MyDeadLock(lockA, lockB), "ThreadAAA").start();
        new Thread(new MyDeadLock(lockB, lockA), "ThreadAAA").start();

    }

}
