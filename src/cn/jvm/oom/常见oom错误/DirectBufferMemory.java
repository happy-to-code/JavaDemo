package cn.jvm.oom.常见oom错误;

import java.nio.ByteBuffer;

/**
 * 演示Direct Buffer Memory错误
 * <p>
 * -Xms5m -Xmx5m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
 *
 * @author 张益飞
 * <p>
 * <p>
 * OOM：direct buffer memory：
 * <p>
 * 在NIO程序中，经常需要使用ByteBuffer来读取或者写入数据，这是一种基于通道(Channel)和缓冲区(Buffer)的IO方式。
 * 它可以使用Native函数库直接分配堆外内存，
 * 然后通过一个存储在Java堆里面的DirectByteBuffer对象作为这块内存引用进行操作。
 * 这样能够在一些场景中显著提高性能，因为可以避免
 * 在Java堆和Native堆中来回复制数据：
 * <p>
 * <p>
 * <p>
 * **    * ByteBuffer.allocate(capacity)：第一种方式是分配JVM堆内存，属于GC管辖范围，
 * **    * 由于需要拷贝所以速度较慢；
 * **    * ByteBuffer.allocateDirect(capacity)：这种方式是分配OS（操作系统）本地内存，不属于GC管辖范围，
 * **    * 由于不需要内存拷贝所以速度相对较快；
 * <p>
 * <p>
 * 但是如果不断分配本地内存，堆内存很少使用，那么JVM就不需要执行GC，DirectBuffer对象们就不会被收，这时候堆内存充足，但是本地内存可能已经使用
 * 完毕，再次尝试分配本地内存就会出现OOM，程序直接崩溃
 */
public class DirectBufferMemory {
    public static void main(String[] args) {
        // 默认应该是1/4系统内存
        System.out.println("配置的堆外内存为：" + (sun.misc.VM.maxDirectMemory()) / (double) 1024 / 1024 + "MB");
        // Exception in thread "main" java.lang.OutOfMemoryError: Direct buffer memory
        // -Xms5m -Xmx5m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
        // 系统分配了5m  但此时却“new” 6M
        ByteBuffer.allocateDirect(6 * 1024 * 1024);
    }
}
