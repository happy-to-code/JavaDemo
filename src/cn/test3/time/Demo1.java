package cn.test3.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/4
 */
public class Demo1 {
    public static void main(String[] args) {
        String s = "1583133482";

        Long value = Long.valueOf(s);
        System.out.println(value);


        String result1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(value * 1000));
        System.out.println("10位数的时间戳（秒）--->Date:" + result1);


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");

        Date date = new Date(value * 1000);
        String format = simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(format);
    }
}
