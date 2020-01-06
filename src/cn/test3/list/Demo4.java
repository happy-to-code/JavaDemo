package cn.test3.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/1/3
 */
public class Demo4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // for循环 int i = 0, len = list.size()
        for (int i = 0, len = list.size(); i < len; i++) {
            System.out.println("--------");
            System.out.println(list.get(i));
            System.out.println("____________");
        }





    //    biaoji

    }
}
