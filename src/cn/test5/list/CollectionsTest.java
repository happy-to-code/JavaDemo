package cn.test5.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/28 16:39
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 4, 5, 8, 0, 11, 45, 30);
        System.out.println("list = " + list);
        // 排序
        Collections.sort(list);
        System.out.println("list = " + list);
        Integer max = Collections.max(list);
        System.out.println("max = " + max);

    }
}
