package cn.test2.pow;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/8/30
 */
public class Demo {
    public static void main(String[] args) {
        double pow = Math.pow(2, 31);
        System.out.println(pow);
        System.out.println((pow - 1) == 2147483647);
    }
}
