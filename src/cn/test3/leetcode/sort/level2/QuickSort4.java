package cn.test3.leetcode.sort.level2;

import java.util.Arrays;

/**
 * @Describle:优化： 1、快速排序对于处理小数组（N <= 20）的数组时，快速排序比插入排序要慢， 所以在排序小数组时应该切换到插入排序，
 * 我们面对小数组的通常的解决办法是对于小的数组不递归的使用快速排序，而代之以诸如插入排序这样的对小数组有效的排序算法。
 * <p></p>
 * 2、普通的快速排序还有一个缺点， 那就是会交换一些相同的元素，尤其是当我们处理有大量重复元素的数组时，快排会做很多的无用功，
 * 所以由此人们研究出了三切分快排（三路划分） ， 在左右游标的基础上，再增加了一个游标，用于处理和基准元素相同的元素，
 * 也就是将数组分为三部分：小于当前切分元素的部分，等于当前切分元素的部分，大于当前切分元素的部分。
 * @Author: zhangyifei
 * @Date: 2019/11/27
 */
public class QuickSort4 {
    public static void exchange(int[] sum, int i, int j) {
        int temp = sum[i];
        sum[i] = sum[j];
        sum[j] = temp;
    }

    public static void quickSort(int[] nums, int top, int tail) {
        if (top >= tail) {
            return;
        }
        int lt = top, gt = tail, i = top + 1;
        int pivot = nums[top];
        while (i <= gt) {
            if (nums[i] > pivot) {
                exchange(nums, i, gt--);
            } else if (nums[i] < pivot) {
                exchange(nums, i++, lt++);
            } else {
                i++;
            }
        }
        quickSort(nums, top, lt - 1);
        quickSort(nums, gt + 1, tail);
    }


    private static void printArr(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 2, 7, 1, 5};
        Arrays.sort(arr);
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
