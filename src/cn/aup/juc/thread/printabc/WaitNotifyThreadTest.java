package cn.aup.juc.thread.printabc;

public class WaitNotifyThreadTest {

    public static Boolean flag = true;
    public static int i = 0;
    public static Object lock = new Object();


    public static void main(String[] args) {
        Thread wait = new Thread(new WaitNotifyThreadTest.Wait());
        Thread notify = new Thread(new WaitNotifyThreadTest.Notify());
        wait.start();
        notify.start();
    }


    static class Wait implements Runnable {
        @Override
        public void run() {
            while (i < 10) {
                synchronized (lock) {
                    if (flag) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("B");
                        flag = !flag;
                        i++;
                        lock.notify();
                    }
                }
            }
        }
    }


    static class Notify implements Runnable {
        @Override
        public void run() {
            while (i < 10) {
                synchronized (lock) {
                    if (!flag) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        flag = false;
                        System.out.println("A");
                        i++;
                        lock.notify();
                    }
                }
            }
        }
    }
}
