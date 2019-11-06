package cn.test.cn.test.forfor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/22
 */
public class TestForFor {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(3);
        list2.add(2);
        list2.add(1);
        System.out.println(list1);
        System.out.println(list2);

        for (Integer integer1 : list1) {
            for (Integer integer2 : list2) {
                if (integer1.equals(integer2)) {
                    list2.remove(integer2);
                }
            }
        }

        System.out.println(list1);
        System.out.println(list2);
    }
}
