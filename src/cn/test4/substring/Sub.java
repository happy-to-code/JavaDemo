package cn.test4.substring;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/1/9
 */
public class Sub {
    public static void main(String[] args) {
        String tarDir = "upload/member/";

        String oldPicUrl = "D://ElementWin/royaltyPic/upload/member//D965C05B42A04A389D2E5070C58776D2.png";
        System.out.println(oldPicUrl.length());

        System.out.println("D965C05B42A04A389D2E5070C58776D2".length());

        System.out.println(oldPicUrl.substring((oldPicUrl.indexOf(tarDir) + tarDir.length() + 1)));
    }
}
