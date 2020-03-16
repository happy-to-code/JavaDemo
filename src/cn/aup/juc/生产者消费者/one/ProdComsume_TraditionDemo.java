package cn.aup.juc.生产者消费者.one;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Describle:传统生产者消费者写法
 * @Author: zhangyifei
 * @Date: 2020/3/6 21:00
 * 将空调温度+1，然后-1，这样循环5轮
 */
class ShareData {
    /**
     * 共享变量
     */
    private Integer number = 0;

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void increment() throws Exception {
        lock.lock();
        try {
            // 1、判断 此时有“商品”了
            while (number != 0) {
                // 等待
                condition.await();
            }
            // 2、干活 生产
            number++;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            // 3、通知唤醒
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() throws Exception {
        lock.lock();
        try {
            // 1、判断 此时没有“商品”了
            while (number == 0) {
                // 等待
                condition.await();
            }
            // 2、干活  消费
            number--;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            // 3、通知唤醒
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

/**
 * 多线程操作的“口诀”
 * ==========================================
 * ****线程     操作（方法）  资源类
 * ****判断     干活         通知
 * ****防止虚假唤醒机制
 * ==========================================
 */
public class ProdComsume_TraditionDemo {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();

        // 生产者生产
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    shareData.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "生产者").start();

        // 消费者生产
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    shareData.decrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "消费者").start();
    }
}
