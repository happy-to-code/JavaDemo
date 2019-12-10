package cn.test3.forfor;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/12
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i:" + i + "," + "j:" + j);
                // if (i == j) {
                    break;
                // }

            }

        }

    }
}
