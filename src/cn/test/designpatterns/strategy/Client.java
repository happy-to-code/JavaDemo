package cn.test.designpatterns.strategy;

import cn.test.designpatterns.strategy.code.Context;
import cn.test.designpatterns.strategy.code.impl.ConcreteStrategy1;
import cn.test.designpatterns.strategy.code.impl.ConcreteStrategy2;

public class Client {
    public static void main(String[] args) {
        Context context;
        System.out.println("-----执行策略1-----");
        context = new Context(new ConcreteStrategy1());
        context.execute();

        System.out.println("-----执行策略2-----");
        context = new Context(new ConcreteStrategy2());
        context.execute();
    }
}
