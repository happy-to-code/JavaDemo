package cn.test3.leetcode.hash;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Describle:key值相同时 只能存一个
 * @Author: zhangyifei
 * @Date: 2019/12/2
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(8);

        map.put("1", "11");
        map.put("2", "22");
        map.put("1", "33");
        System.out.println(map);
        System.out.println("-----------------");

        Map<String, String> table = new Hashtable<>(4);
        table.put("qq", "qqq");
        table.put("ww", "www");
        table.put("qq", "qqq");
        System.out.println(table);


    }
}
