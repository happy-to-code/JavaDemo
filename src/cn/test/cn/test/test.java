package cn.test.cn.test;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/10/10
 */
public class test {
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "aa";
        String s3 = new String("aa");
        String s4 = new String("aa");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s4 == s3);
    }
}
