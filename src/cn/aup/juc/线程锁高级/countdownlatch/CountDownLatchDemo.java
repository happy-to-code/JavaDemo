package cn.aup.juc.线程锁高级.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @Describle:3 -2 -1 -0 发射。CountDownLatch就是一个计数器，只有当到0时才会执行
 * *****此demo演示6个人都离开教室了，然后班长才关门
 * @Author: zhangyifei
 * @Date: 2020/3/5 20:44
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        // 新建一个CountDownLatch，初始化为6，代表6个线程
        CountDownLatch countDownLatch = new CountDownLatch(6);

        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t 离开教室");

                // 运行完一个线程，计数器就减一
                countDownLatch.countDown();
            }, String.valueOf(i)).start();
        }

        // 此处只有计数器为0时才会解除await
        countDownLatch.await();
        System.out.println("===============班长锁门===================");
    }
}
