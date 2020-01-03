package cn.test3.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/12/23
 */
public class Test3 {
    public static void main(String[] args) {
        // 1576937861914
        // 1576938734000
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String time = "2019-12-25 02:37";
        String time3 = "2019-12-23 22:17";

        Date date = null;
        Date date3 = null;
        try {
            date = format.parse(time);
            date3 = format.parse(time3);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Format To times:" + date.getTime());
        System.out.println("Format To date3:" + date3.getTime());


        double time2 = 1576937861914d;
        String result2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time2);
        System.out.println("13位数的时间戳（毫秒）--->Date:" + result2);
        System.out.println("----------------------");
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - (3600 * 8000));

        System.out.println("--------------------");
        String s1 = "1577154743";
        String s2 = "1577125943091";
        System.out.println(s1.compareTo(s2) > 0);
        System.out.println("====================");
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println((new Date()).getTime());



    }
}
