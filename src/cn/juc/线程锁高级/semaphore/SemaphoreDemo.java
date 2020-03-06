package cn.juc.线程锁高级.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Describle:信号量，不像CyclicBarrier仅仅是增，也不像CountDownLatch仅仅是减，SemaPhore是有伸缩性的
 * @Author: zhangyifei
 * @Date: 2020/3/5 21:40
 * ****模拟6辆车抢3个停车位
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        // 模拟3个停车位
        Semaphore semaphore = new Semaphore(3);

        // 模拟6辆车
        for (int i = 0; i < 6; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        // 获取信号量，那么上面的信号量就要减一
                        semaphore.acquire();
                        System.out.println(Thread.currentThread().getName() + "\t 获得停车位");
                        try {
                            // 此处模拟汽车停1秒钟然后开走
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "\t 汽车开走-----");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        // 释放信号量
                        semaphore.release();
                    }
                }
            }.start();

        }
    }
}
