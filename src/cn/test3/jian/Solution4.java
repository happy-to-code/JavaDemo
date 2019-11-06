package cn.test3.jian;

import java.util.*;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/10/29
 * <p>
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Solution4 {
    public int MoreThanHalfNum_Solution(int[] array) {
        List<Integer> list = new ArrayList<>(10);
        for (int i : array) {
            list.add(i);
        }

        int halfLength = (array.length / 2);

        Map<Integer, Integer> map = new HashMap<>(8);

        for (int i = 0; i < list.size(); i++) {
            int temp = 0;
            Integer one = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                Integer two = list.get(j);
                if (one.equals(two)) {
                    temp++;
                }
            }
            map.put(one, temp);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > halfLength) {
                return entry.getKey();
            }
        }


        return 0;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,2,4,2,5,2,3};
        Solution4 solution4 = new Solution4();
        int i = solution4.MoreThanHalfNum_Solution(array);
        System.out.println(i);
    }
}
