package cn.test2.arrays;

import java.util.HashMap;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/26
 */
public class Test {
    public static void main(String[] args) {
        // List<String> lists = new ArrayList<>(10);
        // System.out.println(lists);
        // System.out.println("======");
        // System.out.println(lists.contains("a"));


        HashMap<String, Long> hashMap = new HashMap<>(10);
        System.out.println("===============");
        System.out.println(hashMap.get("a"));

        hashMap.put("a", 1L);
        hashMap.put("b", 2L);

        System.out.println(hashMap.get("a"));

    }
}
