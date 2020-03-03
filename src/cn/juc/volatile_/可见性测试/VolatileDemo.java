package cn.juc.volatile_.可见性测试;

/**
 * @Describle:测试volatile的可见性
 * @Author: zhangyifei
 * @Date: 2020/3/1
 */

public class VolatileDemo {
    volatile int num = 0;
    // int num = 0;

    /**
     * 将num至为60的方法
     */
    private void addTo60() {
        this.num = 60;
    }

    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();

        // 创建一个名字为AAA的线程
        new Thread("AAA") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "\tcome in");
                // 此处模拟处理数据
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 调用addTo60方法
                volatileDemo.addTo60();

                // 此时再次打印num的值
                System.out.println(Thread.currentThread().getName() + "\t" + volatileDemo.num);
            }
        }.start();

        //  这边是死循环，直到num值不是0
        while (volatileDemo.num == 0) {
        }

        System.out.println(Thread.currentThread().getName() + "mission is over\t" + volatileDemo.num);
    }
}
