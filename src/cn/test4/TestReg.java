package cn.test4;

import java.util.Date;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/12 11:06
 */
public class TestReg {
    public static void main(String[] args) {

        System.out.println((new Date()).getTime());
        String s = " 1 04228陈2   先生1";

        String newStr = s.trim().replaceAll(" ", "");
        System.out.println("s1 = " + newStr);


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) < 48 || newStr.charAt(i) > 57) {
                break;
            }
            if (newStr.charAt(i) >= 48 && newStr.charAt(i) <= 57) {
                sb.append(newStr.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
