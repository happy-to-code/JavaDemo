package cn.jvm.parame;

import java.util.concurrent.TimeUnit;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/7 21:22
 */
public class ParamDemo {
    public static void main(String[] args) {
        System.out.println("test=====");
        try {
            TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
