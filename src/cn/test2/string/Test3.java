package cn.test2.string;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/8/23
 */
public class Test3 {
    public static void main(String[] args) {
        String s0 = "kvill";
        String s1 = "kvill";
        String s2 = "kv" + "ill";
        System.out.println(s0 == s1);
        System.out.println(s0 == s2);

    }
}
