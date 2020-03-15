package cn.test.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2019/3/16
 */
public class ArraysTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap(16);
        Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list1 = Arrays.asList(ia);
        // list1.add(11);  这边会报错
        System.out.println(list1);
        ia[0] = 0;
        System.out.println(list1);


    }


}
