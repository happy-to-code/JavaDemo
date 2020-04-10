package cn.aup.thread.day01;

import java.util.concurrent.TimeUnit;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/7 22:07
 */
class Sequence {
    private int a;

    public synchronized int  getNext() {
        return a++;
    }
}

public class GetNextDemo {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "\t" + sequence.getNext());
            }, "AA").start();
        }
        
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t" + sequence.getNext());
            }, "BB").start();
        }

    }
}
