package cn.test.designpatterns.strategy.code.impl;

import cn.test.designpatterns.strategy.code.IStrategy;

public class ConcreteStrategy2 implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略2");
    }
}
