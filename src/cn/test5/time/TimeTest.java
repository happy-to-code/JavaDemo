package cn.test5.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/16 23:07
 */
public class TimeTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = "2020-04-17 00:36:54";
        Date parse = sdf.parse(s);
        System.out.println("parse = " + parse);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        calendar.set(Calendar.HOUR_OF_DAY, 17);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date start = calendar.getTime();


        System.out.println("start1 = " + start);
        System.out.println("start2 = " + sdf.format(start));
    }
}
