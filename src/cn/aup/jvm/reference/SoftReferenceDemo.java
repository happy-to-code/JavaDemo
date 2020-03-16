package cn.aup.jvm.reference;

import java.lang.ref.SoftReference;

/**
 * 软引用
 * VM: -Xms5m -Xmx5m -XX:+PrintGCDetails
 *
 * @author zhangyifei
 * <p>
 * 对于软引用关联的对象，在系统将要发生内存溢出异常之前，将会把这些对象列进回收范围之内。
 * 如果这次回收后还没有足够的内存，才会抛出异常。即：
 * <p>
 * 当系统内存充足时，软引用不会回收；
 * 当系统内存不足时，软引用会被回收，回收后内存仍然不足，就抛出异常；
 * 软引用通常用在内存敏感的程序中，例如高速缓存中就用到软引用。软引用在Java中用
 * java.lang.ref.SoftReference来表示
 */
public class SoftReferenceDemo {
    public static void main(String[] args) {
        // VM: -Xms5m -Xmx5m -XX:+PrintGCDetails
        Object obj1 = new Object();
        SoftReference<Object> softReference = new SoftReference(obj1);
        System.out.println("obj1 = " + obj1);
        System.out.println("softReference = " + softReference.get());

        obj1 = null;
        try {
            byte[] bytes = new byte[20 * 1024 * 1024];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("obj1 = " + obj1);
            System.out.println("softReference = " + softReference.get());

        }

    }
}
