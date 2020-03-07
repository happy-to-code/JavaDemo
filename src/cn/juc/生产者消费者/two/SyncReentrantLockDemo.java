package cn.juc.生产者消费者.two;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Describle:syschronized只能唤醒一个或者唤醒全部，不能精确唤醒，lock可以精确唤醒
 * @Author: zhangyifei
 * @Date: 2020/3/6 21:44
 * ***********************************************
 * 题目：
 * ABC 3线程循环调用
 * 1、A先打印2次
 * 2、B先打印3次
 * 3、C先打印4次
 * ----
 * 这样循环调用2次
 * ***********************************************
 */
class ShareData {
    /**
     * 线程标志：1（A） 2（B） 3（C）
     */
    private Integer number = 1;

    private Lock lock = new ReentrantLock();

    /**
     * 锁的钥匙
     */
    Condition ca = lock.newCondition();
    Condition cb = lock.newCondition();
    Condition cc = lock.newCondition();

    public void printA() {

        // 上锁
        lock.lock();
        try {
            // 判断 ：如果此时不是A线程，那么就在这等着
            while (number != 1) {
                ca.await();
            }
            // A 线程干活
            for (int i = 0; i < 2; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            System.out.println("==================");
            number = 2;
            //  通知B线程=====此处是精确通知
            cb.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void printB() {
        // 上锁
        lock.lock();
        try {
            // 判断 ：如果此时不是B线程，那么就在这等着
            while (number != 2) {
                cb.await();
            }
            // B 线程干活
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            System.out.println("=======================");
            number = 3;
            //  通知C线程=====此处是精确通知
            cc.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void printC() {
        // 上锁
        lock.lock();
        try {
            // 判断 ：如果此时不是C线程，那么就在这等着
            while (number != 3) {
                cc.await();
            }
            // C 线程干活
            for (int i = 0; i < 4; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            System.out.println("===========================");
            number = 1;
            //  通知A线程=====此处是精确通知
            ca.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

}

public class SyncReentrantLockDemo {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();

        new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                shareData.printA();
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                shareData.printB();
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                shareData.printC();
            }
        }, "C").start();


    }
}
