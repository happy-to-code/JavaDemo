package cn.test.thread.multithread.three;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/21
 */
public class ThreadYield extends Thread {
    public ThreadYield(String name) {
        super(name);
    }

    public static void main(String[] args) {

        ThreadYield yt1 = new ThreadYield("张三");
        ThreadYield yt2 = new ThreadYield("李四");
        yt1.start();
        yt2.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("" + this.getName() + "-----" + i);
            // 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
            if (i == 30) {
                // sleep  当前线程让出执行权 下次执行不会被抢到
                // yield  让出当前执行权  但他自己还是可运行状态  下一次还有可能抢到执行权
                yield();
            }
        }

    }
}
