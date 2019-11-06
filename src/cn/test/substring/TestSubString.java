package cn.test.substring;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/8
 */
public class TestSubString {
    public static void main(String[] args) {
        String s = "https://static.mysiteforme.com/ac628538a1e04a329a7f3ae8c6b7120c";
        System.out.println(s.lastIndexOf("/"));
        String substring = s.substring(s.indexOf("/"));
        System.out.println(substring);

        System.out.println("================================");
        String ss = "沪AD09695";
        String newStr = ss.substring(ss.length() - 6);
        System.out.println(newStr);
    }
}
