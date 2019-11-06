package cn.test3.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/9/6
 */
public class Demo1 {
    public static void main(String[] args) {
        Map<Long, String> map = new HashMap<>(4);
        map.put(0L, "未过期");
        map.put(1L, "即将过期");
        map.put(2L, "已过期");

        String s = map.get(null);
        System.out.println(s);
        String s1 = map.get(2L);
        System.out.println(s1 != null ? s1 : "");
    }
}
