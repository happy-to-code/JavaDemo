package cn.test.cn.test.voidtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/7/25
 */
public class VoidFunction {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        coventList(s);
        System.out.println(s);
    }

    private static void coventList(List<String> s) {
        s.add("d");
        s.add("dd");
        s.add("dsc");
    }
}
