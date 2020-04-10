package cn.test5.listrm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/2 14:28
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("ee");
        list.add("dd");
        System.out.println(list);
        // 排序
        Collections.sort(list);
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("cc".equals(next)) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
