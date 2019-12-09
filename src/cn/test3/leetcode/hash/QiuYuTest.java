package cn.test3.leetcode.hash;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/12/2
 */
public class QiuYuTest {
    public static void main(String[] args) {
        //    A % B == A & (B - 1)   其中B为2的n次方
        int a = 8;
        int b = 8;
        System.out.println(a % b == (a & (b - 1)));
    }
}
