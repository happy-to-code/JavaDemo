package cn.aup.thread.day02;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/15 22:16
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready) {
                // yield()作用 --> 使当前线程从执行状态（运行状态）变为可执行态（就绪状态）
                Thread.yield();
                System.out.println(number + "------------");
            }
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        System.out.println("ready = " + ready);
        number = 42;
        ready = true;
    }


}
