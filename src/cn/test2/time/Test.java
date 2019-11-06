package cn.test2.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/16
 */
public class Test {
    public static void main(String[] args) {
        // long time = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse("2018-12-06 12:34:45", new ParsePosition(0)).getTime() / 1000;
        // System.out.println(time);


        System.out.println("==============================================");

        String expireTime = "2019-08-30";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String currentTime = sdf.format(new Date());
        System.out.println(currentTime);
        // 2019-08-12

        System.out.println(currentTime.compareTo(expireTime));
    }
}
