package cn.test3.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/12/25
 */
public class Test4 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String s = "2019-12-25 02:37";

        String s1 = changeDateToTimeStamp(s, format);
        System.out.println(s1);
    }

    private static String changeDateToTimeStamp(String date, SimpleDateFormat format) {
        Date dateTimeStamp = null;
        try {
            dateTimeStamp = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateTimeStamp.getTime() + "";
    }
}
