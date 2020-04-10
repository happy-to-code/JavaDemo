package cn.test5.mapget;

import java.util.HashMap;
import java.util.Map;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/8 17:15
 */
public class Demo {
    public static void main(String[] args) {
        Map<String,Long> map = new HashMap<>(8);
        map.put("11",123L);
        map.put("12",123L);
        System.out.println(map);

        System.out.println(map.get(11));
        System.out.println(map.get("11"));
    }
}
