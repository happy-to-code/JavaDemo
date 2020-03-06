package cn.test4.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/5 17:08
 */
public class Demo1 {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>(1000000);
        long time = getTime(map);
        System.out.println("time = " + time);

        Map<Integer, Integer> map2 = new HashMap<>(1000000 * 2);
        long time2 = getTime(map2);
        System.out.println("time2 = " + time2);
    }

    private static long getTime(Map<Integer, Integer> map) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            map.put(i, i);
        }
        long time2 = System.currentTimeMillis();
        return (time2 - time1);
    }
}
