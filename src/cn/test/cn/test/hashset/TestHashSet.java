package cn.test.cn.test.hashset;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/5/8
 */
public class TestHashSet {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(3);
        System.out.println("array:" + array);
        //测试HashSet的去重功能
        HashSet hashSet = new HashSet(array);
        array.clear();
        System.out.println("hashSet:" + hashSet);
        System.out.println("array:" + array);
        array.addAll(hashSet);
        System.out.println("array:" + array);

    }
}
