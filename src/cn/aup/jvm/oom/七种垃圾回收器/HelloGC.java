package cn.aup.jvm.oom.七种垃圾回收器;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/8 12:59
 */
public class HelloGC {
    public static void main(String[] args) {
        // java -XX:+PrintCommandLineFlags -version
        //    在控制台运行上面的命令，查看默认使用的垃圾回收器
        //
        // -XX:InitialHeapSize=132318784 -XX:MaxHeapSize=2117100544
        // -XX:+PrintCommandLineFlags -XX:+UseCompressedClassPointers
        // -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC
        // java version "1.8.0_172"
        // Java(TM) SE Runtime Environment (build 1.8.0_172-b11)
        // Java HotSpot(TM) 64-Bit Server VM (build 25.172-b11, mixed mode)

    }
}
