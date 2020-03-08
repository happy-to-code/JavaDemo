package cn.jvm.oom.常见oom错误;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示GC overhead limit exceeded异常
 * <p>
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
 * <p>
 * 注意上面Xms和Xmx值不能太小，否则还没到达GC limit的限制就直接移除了，
 * 抛出java heap space异常
 *
 * @author zhangyifei
 * <p>
 * OOM：GC overhead limit exceeded：
 * <p>
 * GC回收时间过长，过长的定义：******====超过98%的时间用来做GC并且回收了不到2%的堆内存====****，
 * 连续多次GC仍然出现这种情况时，才会抛出该异常。
 * 如果多次出现GC回收时间过长情况，但是并不抛出异常则会出现：
 * <p>
 * GC清理的内存很快又会被再次填满，迫使再次GC，形成恶性循环，CPU使用率一直在100%，而GC却没有任何效果。
 * ————————————————
 */
public class GCOverLimit {
    public static void main(String[] args) {
        int i = 0;
        List<String> lists = new ArrayList<>();
        try {
            while (true) {
                // Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
                lists.add(String.valueOf(i++).intern());
            }
        } catch (Throwable e) {
            System.out.println("=============i:" + i);
            e.printStackTrace();
            return;
        }
    }
}
