package cn.test3.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/2/17
 */
public class Test5 {
    public static void main(String[] args) {
        // 199
        String his = "2020-02-17 16:10:23";
        String now = "2020-02-17 16:13:23";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Date date = null;
        Date date3 = null;
        try {
            date = format.parse(his);
            date3 = format.parse(now);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date + ":"+date3);
        System.out.println(date.getTime() + ":"+date3.getTime());
        System.out.println(date.getTime()/1000 -date3.getTime()/1000);
    }
}
