package cn.test3.stream;

import java.util.HashMap;
import java.util.Map;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/9/5
 */
public class Demo4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        String vaL9 = map.putIfAbsent(10, "val10");
        System.out.println(vaL9);
        map.forEach((id, val) -> System.out.println(val));
    }
}
