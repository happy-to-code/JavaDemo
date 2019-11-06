package cn.test3.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/9/20
 */
public class Demo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(2);
        System.out.println(map);
        map = null;
        System.out.println(map.containsKey("1"));
    }
}
