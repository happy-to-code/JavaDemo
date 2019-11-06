package cn.test.StrToArray;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/5/27
 */
public class Test {
    public static void main(String[] args) {
        String s = "";

        String str = getStr(s);
        System.out.println("--" + str + "--");

    }

    public static String getStr(String s) {
        String newStr = "";

        if (s.trim().length() <= 0) {
            return newStr;
        }

        char[] chars = s.toCharArray();
        for (char aChar : chars) {

            newStr = newStr + "%" + aChar;

        }
        return newStr + "%";
    }
}
