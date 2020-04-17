package cn.test5.lessfor;

import java.util.Arrays;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/17 01:07
 */
public class Test {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("113", "113", "123", "155", "166");
        List<String> list2 = Arrays.asList("22", "33", "44", "155", "66");

        String temp = "";
        outf:
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(temp) || i == 0) {
                prints(list1.get(i));
            }
            temp = list1.get(i);

            for (String s1 : list2) {
                if (list1.get(i).equals(s1)) {
                    System.out.println("----" + s1);
                    continue outf;
                }
            }

        }

    }

    private static void prints(String s) {
        System.out.println("s ========= = :" + s);
    }
}
