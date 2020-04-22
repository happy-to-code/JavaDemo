package cn.test3.time;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/10/22
 */
public class Test2 {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis() / 1000;
        // 获取当前时间 60天之前的时间  精确到秒
        long currentTimeBefore60 = 1571820204 - (3600 * 24 * 60);

        System.out.println(currentTime);
        System.out.println(currentTimeBefore60);

        List<String> list = new ArrayList<>(10);

        if (list.isEmpty()) {
            System.out.println(1);
        }
    }
}
