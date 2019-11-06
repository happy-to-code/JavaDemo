package cn.test3.jian;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/10/28
 * <p>
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Solution2 {
    public int Fibonacci(int n) {
        List<Integer> list = new ArrayList<>(10);
        if (n <= 0) {
            list.add(0);
        }
        if (n > 0 && n <= 1) {
            list.add(0);
            list.add(1);
        }
        if (n > 1 && n <= 2) {
            list.add(0);
            list.add(1);
            list.add(1);
        }
        if (n >= 3) {
            list.add(0);
            list.add(1);
            list.add(1);
            for (int i = 3; i <= 39; i++) {
                list.add(list.get(i - 1) + list.get(i - 2));
            }
        }
        return list.get(n);

    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int fibonacci = solution2.Fibonacci(7);
        System.out.println(fibonacci);
    }

}
