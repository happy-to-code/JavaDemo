package cn.jvm.oom.常见oom错误;

/**
 * @Describle:StockOverFlowError错误
 * @Author: zhangyifei
 * @Date: 2020/3/8 01:02
 */
public class StockOverFlowError {
    public static void main(String[] args) {
        // at cn.jvm.oom.常见oom错误.StockOverFlowError.test(StockOverFlowError.java:14)
        test();
    }

    private static void test() {
        test();
    }
}
