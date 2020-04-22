package cn.test.cn.test.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/9/14
 */
public class RetainAll {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("D");
        list1.add("A");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");


        System.out.println(list1);
        System.out.println(list2);
        System.out.println(new Date());
        System.out.println(System.currentTimeMillis());
    }
}
