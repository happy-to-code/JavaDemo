package cn.aup.juc.volatile_.可见性测试;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/1
 */
public class CreateThreadMethod {
    public static void main(String[] args) {
        new Thread("方法1") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }, "方法2").start();

        new Thread(() -> System.out.println(Thread.currentThread().getName()), "方法3").start();
    }
}
