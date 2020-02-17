package cn.test4.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/1/21
 */
public class Test1 {
    public static void main(String[] args) {
        Set<String> setTest = new HashSet<>();

        // setTest.add("qq");
        // setTest.add("aa");
        // setTest.add("qq");

        System.out.println(setTest);

        System.out.println(setTest.contains("aa"));
        System.out.println(setTest.contains("aa1"));
    }
}
