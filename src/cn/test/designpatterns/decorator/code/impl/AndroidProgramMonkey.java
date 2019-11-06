package cn.test.designpatterns.decorator.code.impl;

import cn.test.designpatterns.decorator.code.ProgramMonkey;

/**
 * ConcreteComponent（具体构件）
 */
public class AndroidProgramMonkey implements ProgramMonkey {
    @Override
    public void skills() {
        System.out.println("会写Android代码！");
    }
}