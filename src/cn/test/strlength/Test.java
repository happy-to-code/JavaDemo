package cn.test.strlength;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/5/16
 */
public class Test {
    public static void main(String[] args) {
        String s = "沪AD69287";
        String ss = "苏E6P70A";

        System.out.println(s.length());
        System.out.println(ss.length());
        System.out.println("======================");

        String code = "    abc  eff    de t   sfsd    ooop ";
        String replace = code.replaceAll(" ", "");
        System.out.println("::::|"+replace+"|");




    }
}
