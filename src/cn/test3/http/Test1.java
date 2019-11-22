package cn.test3.http;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/18
 */
public class Test1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);

        list.add("11");
        list.add("23");
        list.add("25");
        list.add("28");

        System.out.println(list.get(1));

        return;

    }

}
