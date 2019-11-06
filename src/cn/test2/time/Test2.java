package cn.test2.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/8/21
 */
public class Test2 {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String time1 = "2019-8-21";

        Date date = df.parse(time1);
        System.out.println(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        long timestamp = cal.getTimeInMillis();
        System.out.println(timestamp / 1000);

        long last = timestamp / 1000 + 3600 * 24 - 1;
        System.out.println(last);

        System.out.println("================");
        long time2 = timestamp - 1;

        Date d = new Date(time2);
        System.out.println(df.format(d));

    }
}
