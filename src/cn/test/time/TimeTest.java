package cn.test.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/11/27
 */
public class TimeTest {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        long v = 1515427200000L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(v);
        System.out.println(s);

        long c = System.currentTimeMillis();
        System.out.println("c:"+c);
        System.out.println("v:"+v);
        System.out.println("===========");
        long t = (c-v) / (1000 * 60 * 60 * 24);
        System.out.println(t);



        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = df.parse("2019-06-27");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        long timestamp = cal.getTimeInMillis();
        System.out.println(timestamp/1000);


    }
}
