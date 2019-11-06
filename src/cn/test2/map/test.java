package cn.test2.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/8/15
 */
public class test {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(10);

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        map.put("ssfds","9000");
        System.out.println(map.size());
        System.out.println(map.isEmpty());


        System.out.println("=================");
        Map<String, Integer> provAndVehCount = new HashMap<>(10);
        System.out.println(provAndVehCount);
        Integer integer = provAndVehCount.get("1");
        System.out.println(integer);
    }
}
