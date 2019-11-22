package cn.test3.niuke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,
 * 当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,
 * 并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class Solution1 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        int sum = 0;
        int[] clone = array.clone();
        Arrays.sort(clone);

        if (clone[0] >= 0) {
            for (int i = 0; i < array.length; i++) {
                sum += clone[i];
            }
            max = sum;

        } else {

            int maxInArray = clone[clone.length - 1];
            List<Integer> newList = new ArrayList<>(10);
            newList.add(maxInArray);

            List<Integer> list = new ArrayList<>(array.length);

            for (int i = 0; i < array.length; i++) {
                list.add(array[i]);
            }

            for (int i = 0; i < list.size(); i++) {
                int temp = list.get(i);
                for (int j = i + 1; j < list.size(); j++) {
                    temp += list.get(j);
                    if (temp > maxInArray) {
                        newList.add(temp);
                    }
                }
            }

            for (Integer integer : newList) {
                if (integer > max) {
                    max = integer;
                }
            }


        }
        return max;
    }


    public static void main(String[] args) {
        int[] array = {-2, -2, -8, -1, -5, -9};
        Solution1 s = new Solution1();
        int i = s.FindGreatestSumOfSubArray(array);
        System.out.println(i);
    }
}