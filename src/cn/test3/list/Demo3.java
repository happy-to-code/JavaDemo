package cn.test3.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/22
 */
public class Demo3 {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();

        // 过滤集合中相同的元素
        List<Long> listWithoutDup = new ArrayList<>(new HashSet<>(list));
        System.out.println(listWithoutDup);
    }
}
