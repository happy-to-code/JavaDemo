package cn.test.time;

import java.util.Calendar;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/8
 */
public class Test3 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR, 12);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        System.out.println("1111111111111==" + cal.getTimeInMillis());
        System.out.println("2222222222222==" + System.currentTimeMillis());
        System.out.println("3333333333333==" + (cal.getTimeInMillis() - System.currentTimeMillis()));
    }
}
