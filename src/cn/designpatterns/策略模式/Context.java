package cn.designpatterns.策略模式;

import cn.designpatterns.策略模式.strategy.Strategy;

public class Context {
    /**
     * 将接口放到类中，使用时new具体的类
     */
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
