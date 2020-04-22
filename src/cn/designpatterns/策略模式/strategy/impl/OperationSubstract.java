package cn.designpatterns.策略模式.strategy.impl;

import cn.designpatterns.策略模式.strategy.Strategy;

public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
