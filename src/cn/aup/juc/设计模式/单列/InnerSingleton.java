package cn.aup.juc.设计模式.单列;

/**
 * @Describle:Singleton 类被装载了，instance 不一定被初始化，
 * 只有在调用的时候才进行加载，达到了类似懒汉模式的效果，而这种方法又是线程安全的。
 * @Author: zhangyifei
 * @Date: 2020/3/2
 */
public class InnerSingleton {
    private InnerSingleton() {
    }

    public static final InnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }
}
