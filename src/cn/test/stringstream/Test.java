package cn.test.stringstream;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/6/12
 */
public class Test {
    public static void main(String[] args) {
        String str = "123ABcd!@#$%";
        String str1 = null;

        String s = strToBinstr(str);
        System.out.println(s);

        String s1 = strToBinstr("110001 110010 110011 1000001 1000010 1100011 1100100 100001 1000000 100011 100100 100101");

        System.out.println("s1:" + s1);

        String s2 = BinstrToStr("110001 110010 110011 1000001 1000010 1100011 1100100 100001 1000000 100011 100100 100101");
        System.out.println("s2:" + s2);

        System.out.println("=============");
        // String s = byte2hex(bytes);
        // System.out.println(s);

    }


    /**
     * 将二进制字符串转换成Unicode字符串
     *
     * @param binStr
     * @return
     */
    public static String BinstrToStr(String binStr) {
        String[] tempStr = StrToStrArray(binStr);
        char[] tempChar = new char[tempStr.length];
        for (int i = 0; i < tempStr.length; i++) {
            tempChar[i] = BinstrToChar(tempStr[i]);
        }
        return String.valueOf(tempChar);
    }


    /**
     * 将初始二进制字符串转换成字符串数组，以空格相隔
     *
     * @param str
     * @return
     */
    public static String[] StrToStrArray(String str) {
        return str.split(" ");
    }


    /**
     * 将二进制字符串转换为char
     *
     * @param binStr
     * @return
     */
    public static char BinstrToChar(String binStr) {
        int[] temp = BinstrToIntArray(binStr);
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[temp.length - 1 - i] << i;
        }
        return (char) sum;
    }


    /**
     * 将二进制字符串转换成int数组
     *
     * @param binStr
     * @return
     */
    public static int[] BinstrToIntArray(String binStr) {
        char[] temp = binStr.toCharArray();
        int[] result = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            result[i] = temp[i] - 48;
        }
        return result;
    }

    /**
     * 二进制转字符串
     *
     * @param str
     * @return
     */
    public static String strToBinstr(String str) {
        char[] strChar = str.toCharArray();
        String result = "";
        for (int i = 0; i < strChar.length; i++) {
            result += Integer.toBinaryString(strChar[i]) + " ";
        }
        return result;
    }


    /**
     * 字符串转二进制
     *
     * @param str
     * @return
     */
    public static byte[] hex2byte(String str) {
        if (str == null) {
            return null;
        }

        str = str.trim();
        int len = str.length();

        if (len == 0 || len % 2 == 1) {
            return null;
        }

        byte[] b = new byte[len / 2];
        try {
            for (int i = 0; i < str.length(); i += 2) {
                b[i / 2] = (byte) Integer.decode("0X" + str.substring(i, i + 2)).intValue();
            }
            return b;
        } catch (Exception e) {
            return null;
        }
    }
}
