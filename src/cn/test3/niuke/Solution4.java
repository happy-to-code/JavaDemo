package cn.test3.niuke;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class Solution4 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 9;

        Solution4 s = new Solution4();
        ArrayList<Integer> list = s.FindNumbersWithSum(array, sum);
        System.out.println(list);

    }

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>(10);

        ArrayList<ArrayList<Integer>> listArrayList = new ArrayList<>(10);

        for (int i = 0; i < array.length; i++) {
            int num1 = array[i];
            if (num1 >= sum) {
                continue;
            }
            for (int j = i + 1; j < array.length; j++) {
                int temp = num1 + array[j];
                if (temp == sum) {
                    ArrayList<Integer> subList = new ArrayList<>(10);

                    subList.add(num1);
                    subList.add(array[j]);

                    listArrayList.add(subList);

                    continue;
                }

            }
        }

        if (listArrayList.isEmpty()) {
            return list;
        }

        int count = listArrayList.get(0).get(0) * listArrayList.get(0).get(1);
        for (ArrayList<Integer> arrayList : listArrayList) {
            int temp = arrayList.get(0) * arrayList.get(1);
            if (temp <= count) {
                list.clear();
                list.add(arrayList.get(0));
                list.add(arrayList.get(1));
            }


        }

        return list;
    }
}
