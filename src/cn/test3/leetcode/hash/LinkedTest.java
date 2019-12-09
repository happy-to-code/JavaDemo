package cn.test3.leetcode.hash;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Describle:实际上，LinkedHashMap 是通过双向链表和散列表这两种数据结构组合实现的。
 * LinkedHashMap 中的“Linked”实际上是指的是双向链表，并非指用链表法解决散列冲突。
 * @Author: zhangyifei
 * @Date: 2019/12/2
 */
public class LinkedTest {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new LinkedHashMap<>();
        m.put(3, 11);
        m.put(1, 12);
        m.put(5, 23);
        m.put(2, 22);

        for (Map.Entry e : m.entrySet()) {
            System.out.println(e.getKey());
        }

        System.out.println("-------------------");

        // 10 是初始大小，0.75 是装载因子，true 是表示按照访问时间排序  LRU
        Map<Integer, Integer> n = new LinkedHashMap<>(10, 0.75f, true);
        n.put(3, 11);
        n.put(1, 12);
        n.put(5, 23);
        n.put(2, 22);

        n.put(3, 26);
        n.get(5);

        for (Map.Entry e : n.entrySet()) {
            System.out.println(e.getKey());
        }
    }
}
