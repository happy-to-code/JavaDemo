package cn.aup.jvm.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @author zhangyifei
 * @Des 虚引用
 * 虚引用需要java.lang.ref.PhantomReference类来实现，如果一个对象仅持有虚引用，那么它和没有任何引用一样，调用get()方法
 * 总返回null，在任何时候都可能被垃圾回收器回收，虚引用必须和引用队列(ReferenceQueue)联合使用：
 * <p>
 * 作用：虚引用的唯一目的就是：当该对象被垃圾收集器回收的时候收到一个系统通知或者后续添加进一步处理，即当一个对象进入
 * finalization阶段，可以被gc回收，用来实现比finalization更加灵活的机制；
 * 具体流程：创建引用时候可以指定关联的队列，当GC释放对象的时候会将引用的对象添加到引用队列中，如果程序发现某个虚引用对象
 * 已经被加入到引用队列中，那么就可以在引用对象的内存回收之前采取必要的措施，这就相当于一种通知机制；
 */
public class PhantomReferenceDemo {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        // 引用队列
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        // 虚引用
        PhantomReference<Object> phantomReference = new PhantomReference<>(obj, referenceQueue);

        System.out.println(obj);
        /**
         * PhantomReference任何时候get都是null
         */
        System.out.println(phantomReference.get());
        // 打印引用队列
        System.out.println(referenceQueue.poll());

        System.out.println("===============");
        /**
         * obj=null，gc之后，引用的对象会被添加到引用队列中，
         * 因此最后的poll方法能够获取到值
         */
        obj = null;
        System.gc();
        Thread.sleep(100);
        System.out.println(obj);
        System.out.println(phantomReference.get());
        System.out.println(referenceQueue.poll());
    }
}
