package cn.aup.juc.设计模式.单列;

/**
 * 此单列是饿汉式：缺点是用到没用到先占用一块内存空间，浪费
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
