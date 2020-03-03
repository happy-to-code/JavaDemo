package cn.juc.单列;

/**
 * @Describle:采用双锁机制，安全且在多线程情况下能保持高性能 DCL(double check lock)
 * @Author: zhangyifei
 * @Date: 2020/3/2
 * 此时单列还不是安全的，虽然有DCL机制，因为指令重排的原因
 * 正常初始化一个对象分为三步：
 * 1、给对象分配内存空间
 * 2、初始化对象
 * 3、将引用指向该对象
 * 但是指令重排之后，执行的顺序可能变成了 1-3-2，此时在中间一步，instance ！= null
 * 解决方法是用Volatile关键字，禁止指令重排
 * private volatile static LockSingleton singleton;
 */
public class LockSingleton {

    private static LockSingleton singleton;

    private LockSingleton() {
    }

    public static LockSingleton getSingleton() {
        if (singleton == null) {
            synchronized (LockSingleton.class) {
                if (singleton == null) {
                    singleton = new LockSingleton();
                }
            }
        }
        return singleton;
    }

}
