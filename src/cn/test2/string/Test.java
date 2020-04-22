package cn.test2.string;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/13
 */
public class Test {
    public static void main(String[] args) {
        // String a = new String("abc").intern();
        // String b = new String("abc").intern();
        //
        // if (a == b) {
        //     System.out.println("a==b");
        // }

        // String a2 = "abc";
        // String b2 = new String("abc");
        // System.out.println(a2 == b2);


        String sss = "http://v.juhe.cn/sweizhang/query?city=SH_NER&hphm=沪AD02318&hpzl=52&engineno=M0301606019&classno= LNJABA61XGVT00475&key=3d5fe9b53b2246a8d85cff85a0c9130a";
        System.out.println(sss.substring(0, 96));

        System.out.println("V".equals("V1"));
    }
}
