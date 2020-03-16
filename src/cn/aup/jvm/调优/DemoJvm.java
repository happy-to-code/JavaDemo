package cn.aup.jvm.调优;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/14 22:56
 */
public class DemoJvm {
    public static void main(String[] args) {
        // java虚拟机（这个进程）能构从操作系统那里挖到的最大的内存
        long maxMemory = Runtime.getRuntime().maxMemory();


        // java虚拟机现在已经从操作系统那里挖过来的内存大小
        long totalMemory = Runtime.getRuntime().totalMemory();

        System.out.println("maxMemory = " + maxMemory / 1024 / 1024 + "M");
        System.out.println("totalMemory = " + totalMemory / 1024 / 1024 + "M");
        // ==========================================================
        // maxMemory = 1796M
        // totalMemory = 123M
        // ==========================================================
        // 未加参数前是上面的值
        // -Xmx50m -Xms50m -XX:+PrintGCDetails
        // ==========================================================
        // 参数解释：-Xmx50m分给JVM最大的内存是50M，-Xms分给JVM最小的内存是50M，-XX:PrintGCDetails 意思是打印出GC的详细信息
        // ==========================================================
        // 现在的值是这样
        // ==========================================================
        // maxMemory = 48M
        // totalMemory = 48M
        // Heap
        // PSYoungGen      total 14848K, used 2147K [0x00000000fef80000, 0x0000000100000000, 0x0000000100000000)
        // eden space 12800K, 16% used [0x00000000fef80000,0x00000000ff198fa0,0x00000000ffc00000)
        // from space 2048K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x0000000100000000)
        // to   space 2048K, 0% used [0x00000000ffc00000,0x00000000ffc00000,0x00000000ffe00000)
        // ParOldGen       total 34304K, used 0K [0x00000000fce00000, 0x00000000fef80000, 0x00000000fef80000)
        // object space 34304K, 0% used [0x00000000fce00000,0x00000000fce00000,0x00000000fef80000)
        // Metaspace       used 3367K, capacity 4496K, committed 4864K, reserved 1056768K
        // class space    used 369K, capacity 388K, committed 512K, reserved 1048576K
        // ==========================================================

    }
}
