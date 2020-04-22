package cn.designpatterns.策略模式;

import cn.designpatterns.策略模式.strategy.impl.OperationAdd;
import cn.designpatterns.策略模式.strategy.impl.OperationMultiply;
import cn.designpatterns.策略模式.strategy.impl.OperationSubstract;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
