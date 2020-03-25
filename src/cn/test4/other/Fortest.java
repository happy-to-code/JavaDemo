package cn.test4.other;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/1/22
 */
public class Fortest {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("i:-->" + i);

            // inner:
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    System.out.println("j:" + j);
                    continue;
                }
                System.out.println("++" + j);
            }

        }
    }
}
