package cn.test4.other;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Enter call() method...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 2571;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(new CallableDemo());
        /**
         * 注意多个线程使用同一个FutureTask对象，对应的call方法只会被执行一次
         */
        new Thread(task, "AAA").start();
        new Thread(task, "BBB").start();
        Integer res = task.get();
        // 过早调用get()方法会导致主线程阻塞
        while (!task.isDone()) {
            // 类似于自旋锁
        }
        System.out.println(res + 100);
    }
}
