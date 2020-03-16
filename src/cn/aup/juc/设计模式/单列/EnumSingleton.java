package cn.aup.juc.设计模式.单列;

/**
 * @Describle:枚举实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。
 * 它更简洁，自动支持序列化机制，绝对防止多次实例化和线程安全的
 * @Author: zhangyifei
 * @Date: 2020/3/2
 */
public enum EnumSingleton {

    INSTANCE;

    public void action() {

    }
}

