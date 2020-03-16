package cn.aup.jvm.reference;

/**
 * @Describle:强引用
 * @Author: zhangyifei
 * @Date: 2020/3/7 23:38
 * <p>
 * 当JVM进行GC时，对于强引用对象，就算出现了OOM也不会对该对象进行回收。
 * 强引用是造成Java内存泄露的主要原因之一
 */
public class StrongerReference {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = obj1;
        obj1 = null;
        System.gc();
        /**
         * obj2属于强引用，不会回收
         */
        System.out.println(obj2);
    }
}
