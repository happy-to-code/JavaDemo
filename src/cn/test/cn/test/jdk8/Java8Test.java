package cn.test.cn.test.jdk8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/10/9
 */
public class Java8Test {
    public static void main(String[] args) {
        Instant instant = Instant.now();
//        System.out.println(instant);
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时mm分ss秒");
        //解析日期
        String dateStr = "2019年10月25日";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate date = LocalDate.parse(dateStr, formatter);

        System.out.println("data:" + date);


        //日期转换为字符串
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss a");
        String nowStr = now.format(format);

        System.out.println("nowStr::" + nowStr);


    }
}
