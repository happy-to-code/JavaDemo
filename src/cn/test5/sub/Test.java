package cn.test5.sub;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/2 13:56
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        System.out.println(list);
        List<String> list1 = list.subList(0, 2);
        System.out.println("list1 = " + list1);

        Set set = new HashSet();
    }
}
