package cn.juc.cas;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Describle:原子对象引用
 * @Author: zhangyifei
 * @Date: 2020/3/3
 */

public class AtomicReferenceDemo {
    public static void main(String[] args) {
        User z3 = new User("z3", 20L);
        User li4 = new User("li4", 22L);

        // 创建一个原子对象引用
        AtomicReference<User> atomicReference = new AtomicReference<>();
        // 将z3放进原子对象引用中
        atomicReference.set(z3);

        // 将z3从主内存中获取到，并保存在自己的工作内存空间，执行比较并交换操作：
        //     如果工作内存中的值和主内存中的值相等，那么将li4写到主内存空间
        System.out.println(atomicReference.compareAndSet(z3, li4) + "\t" + atomicReference.get());

    }

}
