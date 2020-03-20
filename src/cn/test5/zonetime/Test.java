package cn.test5.zonetime;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/19 20:59
 */
public class Test {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now = " + now);
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);
        String format = now.format(DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss"));
        System.out.println("format = " + format);
        LocalDate localDate = now.toLocalDate();
        System.out.println("localDate = " + localDate);
        LocalDateTime localDateTime = now.toLocalDateTime();
        System.out.println("localDateTime = " + localDateTime);
        int second = now.getSecond();
        System.out.println("second = " + second);
        Instant instant = now.toInstant();
        System.out.println("instant = " + instant);
        Timestamp from = Timestamp.from(instant);
        System.out.println("from = " + from);
    }
}
