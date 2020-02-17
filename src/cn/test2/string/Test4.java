package cn.test2.string;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/1/16
 */
public class Test4 {
    public static void main(String[] args) {
        String s = "23 23 02 FE 4C 41 36 4E 46 41 41 31 34 48 42 35 31 34 33 39 32 01 00 88 14 01 0F 0F 33 36 01 01 03 01 00 00 00 08 48 46 0D 55 27 10 3F 01 00 4E 20 00 00 02 01 01 03 3D 4E 20 4E 20 36 0D 7A 27 10 05 00 07 3B 88 B5 01 DB B9 2E 06 01 12 0E 7A 01 24 0E 6C 01 04 35 01 08 32 07 00 00 00 00 00 01 00 00 00 04 00 00 02 00 00 17 7E 00 00 17 81 E1 00 06 A6 56 00 00 00 00 E3 00 0D 03 01 FF FF FF FF A1 0C 03 02 01 20 08 E4 00 14 00 03 10 04 5E 1E 66 63 10 0E 5E 1E 1E 00 10 11 5E 1E 66 89 89 ";
        System.out.println(s.length());

        String s1 = s.replaceAll(" ","");
        System.out.println(s1);
        System.out.println(s1.length());
    }
}
