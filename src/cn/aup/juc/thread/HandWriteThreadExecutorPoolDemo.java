package cn.aup.juc.thread;

import java.util.concurrent.*;

/**
 * @Describle:手写线程池
 * @Author: zhangyifei
 * @Date: 2020/3/7 15:22
 */
public class HandWriteThreadExecutorPoolDemo {
    public static void main(String[] args) {
        /**
         * 核心线程数：2
         * 最大线程数：5（包含核心线程数）
         * 非核心线程存活时间：1秒
         * 时间单位：秒
         * 阻塞队列的容量：3
         * 线程工厂：默认
         * 拒绝策略：XXX
         * ++++++++++++++++
         AbortPolicy(默认):直接抛出RejectedException异常阻止系统正常运行
         CallerRunsPolicy:"调用者运行"一种调节机制,该策略既不会抛弃任务,也不会抛出异常,而是
         DiscardOldestPolicy:抛弃队列中等待最久的任务,然后把当前任务加入队列中尝试再次提交
         DiscardPolicy:直接丢弃任务,不予任何处理也不抛出异常.如果允许任务丢失,这是最好的拒绝策略
         * ++++++++++++++++
         */
        ExecutorService threadPool = new ThreadPoolExecutor(2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy());


        // 模拟N个用户去银行办理业务
        try {
            for (int i = 0; i < 10; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t 办理业务。。。。。");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
