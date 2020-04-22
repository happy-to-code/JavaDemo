package cn.test4.other;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/4 15:26
 */
public class Test9 {
    public static void main(String[] args) {
        ConcurrentHashMap c = new ConcurrentHashMap();

        AtomicInteger atomicInteger = new AtomicInteger(10);
        atomicInteger.getAndSet(1);
        atomicInteger.compareAndSet(1, 1);
        Boolean b = true;
        if (b) {
            System.out.println("b = " + b);
        }
    }
}
