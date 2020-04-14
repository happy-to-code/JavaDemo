package cn.test5.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/14 10:15
 */
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = fmt.parse("2020-04-12 16:12:45");

        boolean b = checkAddTimeIsLe24(date);
        System.out.println("b = " + b);
    }

    private static boolean checkAddTimeIsLe24(Date passDate) {
        if (null == passDate) {
            return false;
        }
        // 获取当日 24点的时间戳
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 24);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date start = calendar.getTime();
        return passDate.getTime() <= start.getTime();
    }
}
