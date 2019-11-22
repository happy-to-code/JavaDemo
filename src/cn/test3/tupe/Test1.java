package cn.test3.tupe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/14
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(10);
        List<String> list2 = new ArrayList<>(10);
        list1.add("1");
        list1.add("2");
        list1.add("3");

        list2.add("1");
        list2.add("6");
        list2.add("1");
        list2.add("7");

        Map<String, String> sameNameMap = new HashMap<>(4);

        for (String s1 : list1) {
            for (String s2 : list2) {
                if (s1.equals(s2)) {
                    if (sameNameMap.containsKey(s2)) {
                        break;
                    }
                    System.out.println(11212);
                    sameNameMap.put(s2, s2);
                }

                System.out.println(444444444);
            }
            System.out.println(1111111111);

        }


    }
}
