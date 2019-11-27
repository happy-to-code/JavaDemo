package cn.test3.leetcode.sort.level2;

/**
 * @Describle:快排
 * @Author: zhangyifei
 * @Date: 2019/11/27
 */
public class QuickSort3 {

    public static void quickSort(int[] nums, int top, int tail) {
        if (top >= tail) {
            return;
        }
        int mid = nums[tail];
        int left = top, right = tail - 1;
        while (left < right) {
            while (nums[left] < mid && left < right) {
                left++;
            }
            while (nums[right] >= mid && left < right) {
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        if (nums[left] >= nums[tail]) {
            int temp = nums[left];
            nums[left] = nums[tail];
            nums[tail] = temp;
        } else {
            left++;
        }
        quickSort(nums, top, left - 1);
        quickSort(nums, left + 1, tail);
    }

    private static void printArr(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 2, 7, 9, 1, 8, 5};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
