package cn.juc.线程锁高级.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Describle:循环阻塞，CountDownLatch是做减法，而CyclicBarrier是做加法，到达预定数字才会运行
 * @Author: zhangyifei
 * *****此demo演示集齐七龙珠，然后召唤神龙
 * @Date: 2020/3/5 21:21
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {

        // CyclicBarrier(int parties, Runnable barrierAction)
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
            System.out.println("==============召唤神龙===============");
        });

        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t 龙珠");
                try {
                    // 运行一个线程时就阻塞，直到线程数量为7时解除阻塞
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
