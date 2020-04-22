package cn.test.betterstrategy;

/**
 * @Describle:策略者模式测试
 * @Author:zhangyifei
 * @Date:2018/5/8
 */
public class TranficCalculator {
    CalculateStrategy mStrategy;

    public static void main(String[] args) {
        TranficCalculator calculator = new TranficCalculator();
        //设置计算策略
        calculator.setStrategy(new SubwayStrategy());
        //计算价格
        System.out.println("公交车乘20公里的价格：" + calculator.calculatePrice(20));

    }

    public void setStrategy(CalculateStrategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }
}
