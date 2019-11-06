package cn.test2.decmial;

import java.math.BigDecimal;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/8/8
 */
public class Test {
    public static void main(String[] args) {
        String costStr = "0.00";

        BigDecimal cost = new BigDecimal(costStr);
        System.out.println(cost);
    }
}
