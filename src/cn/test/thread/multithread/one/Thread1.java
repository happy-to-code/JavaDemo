package cn.test.thread.multithread.one;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/21
 */

class Thread1 extends Thread {
    private String name;

    public Thread1(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Thread1 mTh1 = new Thread1("A");
        Thread1 mTh2 = new Thread1("B");
        //优先级
        mTh1.setPriority(MAX_PRIORITY);
        mTh2.setPriority(MIN_PRIORITY);
        mTh1.start();
        mTh2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                // sleep  当前线程让出执行权 下次执行不会被抢到
                // yield  让出当前执行权  但他自己还是可运行状态  下一次还有可能抢到执行权
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

