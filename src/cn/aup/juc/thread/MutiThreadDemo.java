package cn.aup.juc.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Describle: 多线程的写法
 * @Author: zhangyifei
 * @Date: 2020/3/6 23:37
 */
class MyThread1 implements Runnable {

    @Override
    public void run() {

    }
}

class MyThread2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("========Callable========");
        return 1024;
    }
}

/**
 * 上面两种的写法对比：
 * ***======================
 * *******callable有范型
 * *******callable有返回值
 * *******callable会抛出异常
 * *******callable重新call方法
 * ***======================
 */
class MyThread3 extends Thread {

}

public class MutiThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // FutureTask(Callable<V> callable)
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread2());

        Thread thread = new Thread(futureTask, "AAA");
        thread.start();

        System.out.println("futureTask.get() = " + futureTask.get());
    }
}
