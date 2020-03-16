package cn.aup.juc.thread;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newCachedThreadPool;

/**
 * @Describle: 线程池创建线程的方法
 * @Author: zhangyifei
 * @Date: 2020/3/7 13:25
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 查看电脑 核数
        // System.out.println(Runtime.getRuntime().availableProcessors());

        // 固定数量的线程池
        // ExecutorService executorPool = newFixedThreadPool(5);

        // 单个线程  一池一线程
        // ExecutorService executorPool = newSingleThreadExecutor();

        // 带有缓冲区的线程池 一个线程池中具体有多少线程不知道，要看具体情况
        ExecutorService executorPool = newCachedThreadPool();

        //================================================
        // 上面的三种都是最基础的，但是阿里巴巴开发手册规定，这三种都不能用，我们要自己手写线程池
        //================================================

        // 模拟10个用户去银行办理业务
        try {
            for (int i = 0; i < 10; i++) {
                executorPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t 办理业务");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorPool.shutdown();
        }

    }
}
