package cn.test3.niuke;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * //num1,num2分别为长度为1的数组。传出参数
 * //将num1[0],num2[0]设置为返回结果
 */
public class Solution3 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {

        List<Integer> list = new ArrayList<>(10);

        for (int i : array) {
            int count = 0;
            for (int j : array) {
                if (i == j) {
                    count++;
                }
            }
            if (count == 1) {
                list.add(i);
            }

        }

        num1[0] = list.get(0);
        num2[0] = list.get(1);

    }
}