package cn.test.time;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/8
 */
public class Test2 {
    public static Long getTodayZeroPointTimestamps() {
        //当前的时间戳
        Long currentTimestamps = System.currentTimeMillis();
        // 一天的毫秒数
        Long oneDayTimestamps = Long.valueOf(60 * 60 * 24 * 1000);

        Long l = currentTimestamps + 60 * 60 * 8 * 1000;

        return (currentTimestamps - l % oneDayTimestamps) / 1000;
    }

    public static void main(String[] args) {
        System.out.println(Test2.getTodayZeroPointTimestamps());
    }
}
