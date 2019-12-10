package cn.test3.date;

import java.util.Date;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/12/9
 */
public class TestDateUtil {
    public static void main(String[] args) {
        Date followDeadline = new Date("Sat Aug 24 18:42:39 CST 2019");
        System.out.println(followDeadline);


        System.out.println(DateUtils.isToday(followDeadline));
        System.out.println("------------------------------");
        System.out.println(DateUtils.compareToday(followDeadline) == -1);


    }
}
