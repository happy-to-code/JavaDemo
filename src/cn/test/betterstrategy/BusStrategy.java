package cn.test.betterstrategy;

/**
 * @Describle: 公交车计算策略
 * @Author:zhangyifei
 * @Date:2018/5/8
 */
public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }

}
