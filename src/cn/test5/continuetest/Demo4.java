package cn.test5.continuetest;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/10 22:30
 */
public class Demo4 {
    public static void main(String[] args) {
        outF:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    continue outF;
                }
                System.out.println("i = " + i + ":j = " + j);
            }
        }
    }
}
