package cn.test3.jian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,
 */
public class Solution5 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        List<Integer> list = new ArrayList<>(10);
        for (int i : input) {
            list.add(i);
        }

        Collections.sort(list);

        List<Integer> list2 = new ArrayList<>(10);
        for (int i = 0; i <= k; i++) {
            list2.add(list.get(i));
        }


        return (ArrayList<Integer>) list2;
    }
}