package cn.test2.count;

import java.math.BigDecimal;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/9/4
 */
public class Demo {
    public static void main(String[] args) {
        Double d1 = 0.1;
        Double d2 = 0.2;
        Double d3 = d1 + d2;
        System.out.println(d3);


        BigDecimal big1 = BigDecimal.valueOf(0.1);
        BigDecimal big2 = BigDecimal.valueOf(0.2);

        BigDecimal big3 = big1.add(big2);
        System.out.println(big3);

    }
}
