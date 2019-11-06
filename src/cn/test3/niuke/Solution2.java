package cn.test3.niuke;

/**
 * 统计一个数字在排序数组中出现的次数
 */
public class Solution2 {
    public int GetNumberOfK(int[] array, int k) {
        if (array.length <= 0) {
            return 0;
        }

        int count = 0;
        for (int i : array) {
            if (i == k) {
                count++;
            }
        }


        return count;
    }
}