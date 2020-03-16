package cn.aup.juc.设计模式.单列;

/**
 * @Describle: 次处是懒汉式
 * @Author: zhangyifei
 * @Date: 2020/3/2
 */
public class SingletonDemo {
    private static SingletonDemo instance = null;

    /**
     * 私有化构造方法
     */
    private SingletonDemo() {
        System.out.println(Thread.currentThread().getName() + "\t 单列私有化构造方法");
    }

    /**
     * 提供一个获取实例的方法
     * 此处为了安全，可以加synchronized关键字
     *
     * @return
     */
    public static SingletonDemo getInstance() {
        if (null == instance) {
            instance = new SingletonDemo();
        }
        return instance;
    }

    public static void main(String[] args) {
        // System.out.println(getInstance() == getInstance());
        // System.out.println(getInstance() == getInstance());
        // System.out.println(getInstance() == getInstance());
        // System.out.println("---------------------------");

        // 次单列模式在多线程中不适用了
        for (int i = 0; i < 10; i++) {

            new Thread(String.valueOf(i)) {
                @Override
                public void run() {
                    SingletonDemo.getInstance();
                }
            }.start();
        }
    }

}
