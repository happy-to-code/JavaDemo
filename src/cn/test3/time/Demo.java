package cn.test3.time;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/9/25
 */
public class Demo {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis() / 1000;

        long time30 = time1 - 3600 * 24 * 30;

        long time60 = time1 - 3600 * 24 * 60;

        System.out.println(time1);
        System.out.println(time30);
        System.out.println(time60);
        System.out.println("-------------------");
        System.out.println(time1 - 3600 * 24 * 40);
    }
}
