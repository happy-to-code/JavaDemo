package cn.test5.continuetest;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/10 22:01
 */
public class Demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("此处i==3:--->结束循环！");
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
