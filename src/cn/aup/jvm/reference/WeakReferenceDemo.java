package cn.aup.jvm.reference;

import java.lang.ref.WeakReference;

/**
 * @author zhangyifei
 * @date 03.07
 * 弱引用通过java.lang.ref.WeakReference来完成，当JVM进行GC时，
 * 无论内存是否充足，被弱引用关联的对象都会被回收，
 * 即弱引用关联的对象活不到下一次GC时刻
 */
public class WeakReferenceDemo {
    public static void main(String[] args) {
        Object obj1 = new Object();
        WeakReference<Object> wr = new WeakReference<>(obj1);
        System.out.println(obj1);
        System.out.println(wr.get());

        obj1 = null;

        /**
         * 弱引用活不到下一次gc，因此即使内存充足，弱引用也会被回收
         */
        System.gc();
        System.out.println(obj1);
        System.out.println(wr.get());
    }
}
