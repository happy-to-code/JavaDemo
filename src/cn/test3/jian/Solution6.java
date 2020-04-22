package cn.test3.jian;

import java.util.ArrayList;
import java.util.List;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)
 * 中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class Solution6 {
    public static void main(String[] args) {
        String s = "aabqweqwqweeee";
        Solution6 solution6 = new Solution6();


        System.out.println(solution6.FirstNotRepeatingChar(s));
    }

    public int FirstNotRepeatingChar(String str) {
        if ("".equals(str) || str == null) {
            return -1;
        }

        char[] chars = str.toCharArray();
        List<String> list = new ArrayList<>(10);
        for (char c : chars) {
            list.add(String.valueOf(c));
        }


        for (char c : chars) {
            int temp = 0;
            for (char d : chars) {
                if (c == d) {
                    temp++;
                    if (temp >= 2) {
                        continue;
                    }
                }
            }
            if (temp == 1) {
                return list.indexOf(c + "");
            }

        }
        return -1;
    }
}
