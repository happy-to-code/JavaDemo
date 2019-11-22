package cn.test3.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/21
 */
public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(100000);
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            list1.add(i);
        }
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println(currentTimeMillis1 - currentTimeMillis);

        System.out.println("111111111111111111111111111");
        List<Integer> list2 = new ArrayList<>(10);
        long l2 = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            list2.add(i);
        }
        long l3 = System.currentTimeMillis();
        System.out.println(l3 - l2);

    }
}
