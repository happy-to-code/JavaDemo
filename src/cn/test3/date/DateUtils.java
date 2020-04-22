package cn.test3.date;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author MaZhiCheng
 * 提供常用的日期操作的工具类
 */
public class DateUtils {


    // 星期
    public static final String[] WEEK = new String[]{"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
    public static final String[] WEEK_SHORT = new String[]{"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
    public static String FORMAT_Y4M = "yyyy-MM";
    public static String FORMAT_Y4MD = "yyyy-MM-dd";
    public static String FORMAT_Y4MdH = "yyyy-MM-dd HH";
    public static String FORMAT_Y4MdHm = "yyyy-MM-dd HH:mm";
    public static String FORMAT_Y4MdHms = "yyyy-MM-dd HH:mm:ss";
    public static String FORMAT_Y4MdHms_POINT = "yyyy.MM.dd HH:mm:ss";
    public static String FORMAT_Y4MdHms_Compact = "yyyyMMddHHmmss";
    public static String FORMAT_HH = "HH";

    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_Y4MdHms);
        return sdf.format(cal.getTime());
    }

    public static String toTimestamp(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddhhmmss");
        return sdf.format(date.getTime());
    }

    public static String timestamp() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        return sdf.format(cal.getTime());
    }

    public static String getYearMonth(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_Y4M);
        return sdf.format(date);
    }

    public static String getMonth() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        return sdf.format(cal.getTime());
    }

    public static String today() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(cal.getTime());
    }


    public static String getHHmm(Date date) {
        if (date == null) {
            date = new Date();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(date);
    }

    public static String getDateTime(Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.format(date);
    }

    //转化成指定的格式
    public static String getDate(Date date, String pattern) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 是否是工作时间段，用于后台程序等
     *
     * @return
     */
    public static boolean isWorkingTime() {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        return (hour >= 8 && hour < 22);
    }

    /**
     * 得到当前的年月YYMM，用于生成文件夹
     *
     * @return
     */
    public static String getYearMonth() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMM");
        return sdf.format(cal.getTime());
    }

    /**
     * 得到当前的年月YYMM，用于生成文件夹
     *
     * @return
     */
    public static String getYearMonthDay() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        return sdf.format(cal.getTime());
    }

    /**
     * 得到当前的年月YYMM，用于生成文件夹
     *
     * @return
     */
    public static int getDay() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 时间戳转date
     *
     * @param timestamp
     * @return
     */
    public static Date timestamp2date(Long timestamp) {
        return new Date(timestamp);
    }


    public static boolean isToday(Date date) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date);
        int year1 = c1.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH) + 1;
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(new Date());
        int year2 = c2.get(Calendar.YEAR);
        int month2 = c2.get(Calendar.MONTH) + 1;
        int day2 = c2.get(Calendar.DAY_OF_MONTH);
        if (year1 == year2 && month1 == month2 && day1 == day2) {
            return true;
        }
        return false;
    }


    public static boolean isTomorrow(Date date) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date);
        int year1 = c1.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH) + 1;
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(getDateAfter(new Date(), 1));
        int year2 = c2.get(Calendar.YEAR);
        int month2 = c2.get(Calendar.MONTH) + 1;
        int day2 = c2.get(Calendar.DAY_OF_MONTH);
        if (year1 == year2 && month1 == month2 && day1 == day2) {
            return true;
        }
        return false;
    }

    /**
     * 获取某时间几天前的时间
     *
     * @param d
     * @param day
     * @return
     */
    public static Date getDateBefore(Date d, int day) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
        return now.getTime();
    }

    /**
     * 获取某时间几天后的时间
     *
     * @param d
     * @param day
     * @return
     */
    public static Date getDateAfter(Date d, int day) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.DATE, now.get(Calendar.DATE) + day);
        return now.getTime();
    }

    /**
     * 获取指定时间后几个小时的时间
     *
     * @param date
     * @param hours
     * @return
     */
    public static Date getDateAfterHours(Date date, int hours) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, hours);// 24小时制
        return cal.getTime();
    }

    /**
     * 获取某时间后几分钟的时间
     *
     * @param d
     * @param minute
     * @return
     */
    public static String getDateBeforeByMinute(Date d, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, minute);
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
    }

    /**
     * 获取上个月的年月
     *
     * @return
     */
    public static String getLastMonth(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);

        return sdf.format(cal.getTime());
    }

    /**
     * 获取本周的开始日期（周一）
     *
     * @return
     */
    public static Date getWeekdayBegin() {
        Calendar c = Calendar.getInstance();
        int weekday = c.get(Calendar.DAY_OF_WEEK) - 2;
        c.add(Calendar.DATE, -weekday);

        return c.getTime();
    }

    /**
     * 获取指定日期的开始日期（周一）
     *
     * @param date
     * @return
     */
    public static Date getWeekdayBegin(Date date) {
        int week = getWeekOfDate(date);
        int ins = 0;
        if (week == 0) {
            ins = 6;
        } else {
            ins = week - 1;
        }
        return getDateBefore(date, ins);
    }

    /**
     * 根据日期获得星期
     *
     * @param date
     * @return
     */
    public static Integer getWeekOfDate(Date date) {
        Integer[] weekDaysCode = {0, 1, 2, 3, 4, 5, 6};
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int intWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        return weekDaysCode[intWeek];
    }

    /**
     * 获取上午/下午
     *
     * @return
     */
    public static String getAmPm(int hours) {
        if (hours < 12) {
            return "上午";
        } else if (12 <= hours && hours < 19) {
            return "下午";
        } else {
            return "晚上";
        }
    }


    public static Integer compareToday(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date today = formatter.parse(formatter.format(new Date()));
            Date compareDate = formatter.parse(formatter.format(date));
            //小于今天
            if (compareDate.before(today)) {
                return -1;
            }
            //大于今天
            if (compareDate.after(today)) {
                return 1;
            }
            //等于今天
            if (compareDate.equals(today)) {
                return 0;
            }
        } catch (Exception e) {
            System.out.println("转换日期出错");
        }

        return null;

    }
}
