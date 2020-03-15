package cn.test4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/14 17:58
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = null;
        System.out.println(list);
        System.out.println(list.size());
    }
}
