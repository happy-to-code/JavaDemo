package cn.aup.juc.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Describle:CAS--> compareAndSet 比较并交换
 * @Author: zhangyifei
 * @Date: 2020/3/3
 */
public class CasDemo {
    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(5);

        // 当期望值和主内存中的值相等时就交换
        // 期望值是从主内存中拷贝的，update是要更新成的值
        System.out.println(atomicInteger.compareAndSet(5, 20000));
        System.out.println(atomicInteger.compareAndSet(5, 30000));
        atomicInteger.getAndSet(1);
    }
}
