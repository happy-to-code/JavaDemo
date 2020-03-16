package cn.aup.juc.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Describle:读写所---模拟写一个缓存
 * @Author: zhangyifei
 * @Date: 2020/3/4 23:59
 */
class MyCache {
    private volatile Map<String, Object> map = new HashMap<>();

    /**
     * 读写锁
     */
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    /**
     * 模拟存入缓存过程
     * 此时不加锁就会出现问题：读取到空值，因为可能出现一个线程还没有写入成功，另一个线程就去读了，
     * 所以必须要保证写操作的原子性，必须是一个写操作完成了才可以进行下一个线程的操作
     * ***此时这边有一般的锁是可以解决并发问题，但是读读操作之间也加锁？？？会影响效率，应该是只有在写时候才加锁
     * ***这是应该用读写锁
     *
     * @param key
     * @param value
     */
    public void set(String key, Object value) {
        // 写缓存用写锁
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t 正在写入缓存" + key);
            try {
                TimeUnit.MICROSECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(key, value);
            System.out.println(Thread.currentThread().getName() + "\t 正在写入缓存完工。。。。");
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    /**
     * 模拟读取缓存过程
     *
     * @param key
     */
    public void get(String key) {
        // 读取缓存用读锁
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t 正在读取……");
            try {
                TimeUnit.MICROSECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Object result = map.get(key);
            System.out.println(Thread.currentThread().getName() + "\t 读取完成:" + result);
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

}

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        MyCache myCache = new MyCache();

        for (int i = 0; i < 5; i++) {
            int temp = i;
            new Thread(() -> {
                myCache.set(temp + "", temp);
            }, String.valueOf(i)).start();
        }

        for (int i = 0; i < 5; i++) {
            int temp = i;
            new Thread(() -> {
                myCache.get(temp + "");
            }, String.valueOf(i)).start();
        }


    }
}
