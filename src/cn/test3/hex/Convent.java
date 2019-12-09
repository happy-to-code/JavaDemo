package cn.test3.hex;

import java.io.UnsupportedEncodingException;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/10/22
 */
public class Convent {
    /**
     * 16进制直接转换成为字符串(无需Unicode解码)
     *
     * @param hexStr
     * @return
     */
    public static String hexStr2Str(String hexStr) {
        String str = "0123456789ABCDEF";
        char[] hexs = hexStr.toCharArray();
        byte[] bytes = new byte[hexStr.length() / 2];
        int n;
        for (int i = 0; i < bytes.length; i++) {
            n = str.indexOf(hexs[2 * i]) * 16;
            n += str.indexOf(hexs[2 * i + 1]);
            bytes[i] = (byte) (n & 0xff);
        }
        return new String(bytes);
    }

    /**
     * 将16进制字符串转换为byte[]
     *
     * @param str
     * @return
     */
    public static byte[] toBytes(String str) {
        if (str == null || str.trim().equals("")) {
            return new byte[0];
        }

        byte[] bytes = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            String subStr = str.substring(i * 2, i * 2 + 2);
            bytes[i] = (byte) Integer.parseInt(subStr, 16);
        }

        return bytes;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] ss = toBytes("232302fe4c41364e4641413137484235313438333801007e130a160f1615010103010082000812ea0d96280a47012e4e2026000201010148507c5244520dde2ada0500072a5f95022491cb0601120ec201240ea901044d010848070200012000000000020000177e00001781e10006388000000000e3000d0301ffffffffa10c0302012000e4000e0002100e0000000110115dae9ac322");
        System.out.println(new String(ss, "utf-8"));
        // System.out.println(new String(ss, "GB2312"));

    }
}
