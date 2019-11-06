package cn.test.decimal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/10
 */
public class Test {
    public static void main(String[] args) {
        List<BigDecimal> list = new ArrayList<>(10000);
        long l1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            BigDecimal a = new BigDecimal(i);
            list.add(a);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("BigDecimal创建：" + (l2 - l1));
        System.out.println(list.size());
        System.out.println(list);

        long l3 = System.currentTimeMillis();
        for (BigDecimal bigDecimal : list) {
            bigDecimal.doubleValue();
        }
        long l4 = System.currentTimeMillis();

        System.out.println("将BigDecimal转换为double：" + (l4 - l3));

    }
}
