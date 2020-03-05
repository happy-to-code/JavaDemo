package cn.juc.lock;

/**
 * @Describle:synchronized是可重入锁
 * @Author: zhangyifei
 * @Date: 2020/3/4 22:06
 */
class Phone {
    public synchronized void sendMsg() {
        System.out.println(Thread.currentThread().getId() + "\t sendMsg()");
        sendEmail();
    }

    public synchronized void sendEmail() {
        System.out.println(Thread.currentThread().getId() + "\t #####sendEmail()");
    }
}

public class ReenterLockDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();


        // 此处是为了证明t1线程获得了发送短信的锁，那么就自动获得了发送邮件的锁，所以他们的id是一样的
        new Thread("t1") {
            @Override
            public void run() {
                phone.sendMsg();
            }
        }.start();

        new Thread("t2") {
            @Override
            public void run() {
                phone.sendEmail();
            }
        }.start();


    }

}
