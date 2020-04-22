package cn.test3.jian;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/10/29
 * <p>
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution3 {
    public void reOrderArray(int[] array) {
        // 奇数
        List<Integer> odd = new ArrayList<>(10);
        // 偶数
        List<Integer> even = new ArrayList<>(10);

        for (int i : array) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        for (int k = 0; k <= odd.size() - 1; k++) {
            array[k] = odd.get(k);
        }
        for (int h = 0; h <= even.size() - 1; h++) {
            array[h + odd.size()] = even.get(h);
        }

    }


}
