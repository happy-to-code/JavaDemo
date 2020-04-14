package cn.test5.date;

import java.util.Calendar;
import java.util.Date;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/8 19:09
 */
public class Demo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 24);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date start = calendar.getTime();
        System.out.println("start = " + start);
        System.out.println("start = " + start.getTime());

        System.out.println("=====================");

        Long time = (new Date()).getTime() / 1000;
        System.out.println(time);
        System.out.println(time.toString().length());



    }
}
