package cn.test5.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/16 10:29
 */
public class ListEmpty {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        List<String> list = new ArrayList<>(10);
        System.out.println(list.size());
        list.add("1");
        System.out.println(list.size());
        System.out.println("---------------");
        list = null;
        System.out.println(list.isEmpty());
    }
}
