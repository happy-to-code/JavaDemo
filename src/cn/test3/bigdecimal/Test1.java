package cn.test3.bigdecimal;

import java.math.BigDecimal;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/19
 */
public class Test1 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1.01);
        BigDecimal b = new BigDecimal(1.02);
        BigDecimal c = new BigDecimal("1.01");
        BigDecimal d = new BigDecimal("1.02");
        System.out.println(a.add(b));
        System.out.println(c.add(d));

        System.out.println("--");
        BigDecimal add = BigDecimalUtil.add(1.01, 1.02);
        System.out.println(add);
    }
}
