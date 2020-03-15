package cn.jvm.调优;

import java.util.Random;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/14 23:17
 */
public class OomDemo {
    public static void main(String[] args) {
        // -Xms2m -Xmx2m -XX:+PrintGCDetails
        String s = "yida";
        while (true) {
            s = s + new Random(12131).nextInt() + new Random().toString();
        }
    }
}
