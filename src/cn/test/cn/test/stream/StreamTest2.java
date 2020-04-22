package cn.test.cn.test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/7/20
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s");
        list.add("a");
        list.add("sa");
        list.add("sc");

        List<String> sa = list.stream().filter(t -> t.equals("sa")).collect(Collectors.toList());
        System.out.println(sa);
    }
}
