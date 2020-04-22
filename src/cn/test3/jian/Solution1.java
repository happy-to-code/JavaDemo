package cn.test3.jian;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/10/28
 * <p>
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution1 {
    public static void main(String[] args) {
        String str = "W e Are Happy";
        String s = str.replaceAll(" ", "%20");
        System.out.println(s);
    }

    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        String s = str.toString();
        return s.replaceAll(" ", "%20");
    }

}
