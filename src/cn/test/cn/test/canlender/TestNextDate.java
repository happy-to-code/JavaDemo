package cn.test.cn.test.canlender;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/5/10
 */
public class TestNextDate {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        date = calendar.getTime();
        System.out.println(date);
        System.out.println("=====");
        System.out.println(date.getYear());
        System.out.println(date.getMonth()+1);
        System.out.println(date.getDate());
        System.out.println("---------------------------------------");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        localDate = localDate.minusDays(-1);
        System.out.println(localDate);
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int today = localDate.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(today);

    }
}
