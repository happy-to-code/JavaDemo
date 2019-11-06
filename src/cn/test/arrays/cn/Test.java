package cn.test.arrays.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/12
 */
public class Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        System.out.println(list1.size());

        List<Long> list2 = new ArrayList<>(list1.size());
        for (int i = 0; i < 10; i++) {
            list2.add((long) i);
        }
        System.out.println(list2);
    }
}
