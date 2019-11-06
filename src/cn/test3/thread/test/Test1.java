package cn.test3.thread.test;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/9/16
 */
public class Test1 {
    public static class AccountingSync implements Runnable {

        /**
         * 共享资源(临界资源)
         */
        static int i = 0;

        /**
         * synchronized 修饰实例方法
         */
        public
        synchronized void increase() {
            i++;
        }

        @Override
        public void run() {
            for (int j = 0; j < 1000000; j++) {
                increase();
            }
        }

        public static void main(String[] args) throws InterruptedException {
            long time1 = System.currentTimeMillis();
            AccountingSync instance = new AccountingSync();
            Thread t1 = new Thread(instance);
            Thread t2 = new Thread(instance);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println(i);
            long time2 = System.currentTimeMillis();
            System.out.println(time2 - time1);
        }
        /**
         * 输出结果:
         * 2000000
         */
    }
}
