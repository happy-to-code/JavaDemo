package cn.jvm.oom.常见oom错误;

/**
 * 演示OOM：java heap size
 * VM -Xms5m -Xmx5m -XX:+PrintGCDetails
 *
 * @author zhangyifei
 * <p>
 * OOM：java heap space
 * <p>
 * 当new大对象或者不断new新对象，导致new出来的内存超过了heap的大小，
 * 会导致OOM: java heap space异常:
 */
public class JavaHeapSpace {
    public static void main(String[] args) {
        // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        // 创建一个80M大小的对象
        byte[] bytes = new byte[80 * 1024 * 1024];
    }
}
