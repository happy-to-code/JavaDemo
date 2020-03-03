package cn.juc.cas;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Describle:解决ABA问题的JUC工具对象：AtomicStampedReference
 * @Author: zhangyifei
 * @Date: 2020/3/3
 * 带版本号的原子引用类
 */
public class ABADemo {
    /**
     * 此处是没有加信号量的原子引用，用来测试ABA问题
     */
    static AtomicReference<Integer> atomicReference = new AtomicReference<>(100);
    // static AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(100,1);

    public static void main(String[] args) {

        new Thread("t1") {
            @Override
            public void run() {
                // 此线程用来先将值改为101，然后再改为100，即100--101--100，ABA
                atomicReference.compareAndSet(100, 101);
                atomicReference.compareAndSet(101, 100);
            }
        }.start();

        new Thread("t2") {
            @Override
            public void run() {
                // 此处是让t2线程睡1秒钟，让t1线程有足够的时间完成一次ABA问题
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 此处因为没哟版本号的控制，只比较值，所以交换成功了
                System.out.println(atomicReference.compareAndSet(100, 2020) + "\t" + atomicReference.get());
                System.out.println("此时要想不想产生ABA问题，就需要使用到AtomicStampedReference");

            }
        }.start();

    }
}
