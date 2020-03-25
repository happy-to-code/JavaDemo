package cn.test4.other;

import java.time.Clock;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/1/19
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("232302014C413945434343343647534E5344303031010001004F".length());
        Integer i = 0;
        Integer j = null;
        System.out.println(i == 0);

        System.out.println(i.equals(0));
        System.out.println("".equals(j));

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.getZone());
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());

    }
}
