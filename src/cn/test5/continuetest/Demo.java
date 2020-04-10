package cn.test5.continuetest;

import java.util.Arrays;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/9 15:47
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("aa", "bb", "cc");
        List<String> list2 = Arrays.asList("aa", "bb", "cc1");
        f1:
        for (String s1 : list1) {
            for (String s2 : list2) {
                if (s1.equals(s2)) {
                    System.out.println(s1);
                    continue f1;
                }
            }
        }
    }
}
