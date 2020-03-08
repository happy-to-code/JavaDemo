package cn.jvm.oom.常见oom错误;

/**
 * 演示OOM：unable to create new native thread
 * 注意：在Windows上运行这个程序容易出现假死现象！！！
 *
 * @author：张益飞 OOM：unable to create new native thread：
 * 高并发请求服务器时，经常出现如下异常：java.lang.OutOfMemoryError：unable to create new native thread，准确的讲该native thread异常
 * 与对应的平台有关。
 * <p>
 * 导致原因：
 * 应用创建了太多的线程，超过了系统承载极限
 * 对应的服务器不允许你的进程创建过多的线程，linux默认允许单个进程可以创建线程数1024个
 * 解决方案：
 * 想办法降低你的进程创建线程的数量，分析程序是否真的需要创建那么多的线程；
 * 如果应用真的需要创建很多线程，需要修改linux默认配置，扩大linux默认限制；
 */
public class UnableCreateNewNativeThread {
    public static void main(String[] args) {
        for (int i = 0; ; ++i) {
            System.out.println("+++++++" + i + "+++++++");
            // Exception in thread "main" java.lang.OutOfMemoryError: unable to create new native thread
            new Thread(() -> {
                try {
                    Thread.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
