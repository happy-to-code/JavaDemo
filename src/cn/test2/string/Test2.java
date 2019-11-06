package cn.test2.string;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/8/23
 */
public class Test2 {
    public static void main(String[] args) {
        String s = new String("1");
        String intern1 = s.intern();
        System.out.println(intern1);
        String s2 = "1";
        String intern = s2.intern();
        System.out.println(intern);
        System.out.println(s == s2);

        String s3 = new String("2") + new String("2");
        s3.intern();
        String s4 = "22";
        System.out.println(s3 == s4);
    }
}
