package cn.test.betterstrategy;

/**
 * @Describle:地铁计算策略
 * @Author:zhangyifei
 * @Date:2018/5/8
 */
public class SubwayStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km < 22 && km > 12) {
            return 5;
        } else if (km < 32 && km > 22) {
            return 6;
        }
        return 7;
    }
}
