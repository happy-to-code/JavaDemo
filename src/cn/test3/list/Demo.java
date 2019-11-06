package cn.test3.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/9/5
 */
public class Demo {
    public static void main(String[] args) {
        List list = new ArrayList<String>(10);
        System.out.println(list);
        System.out.println(list.size());
        list.add("1");
        list.add(1,"1");

        System.out.println(list);

        List list2 = new LinkedList();
        list2.add("121");
    }
}
