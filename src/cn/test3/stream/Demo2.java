package cn.test3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/9/5
 */
public class Demo2 {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        System.out.println(stringCollection);

        Optional<String> reduced =
                stringCollection
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);

    }
}
