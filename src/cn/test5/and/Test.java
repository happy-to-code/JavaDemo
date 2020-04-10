package cn.test5.and;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/26 21:55
 */
public class Test {
    public static void main(String[] args) {
        int x = 16;
        int y = x - 1;
        for (int n = 0; n < 100; n++) {
            System.out.println((n % x) + "===" + (n & y));
        }
    }
}
