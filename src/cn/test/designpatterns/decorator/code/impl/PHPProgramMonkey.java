package cn.test.designpatterns.decorator.code.impl;

import cn.test.designpatterns.decorator.code.ProgramMonkey;

/**
 * ConcreteComponent（具体构件）
 */
public class PHPProgramMonkey implements ProgramMonkey {
    @Override
    public void skills() {
        System.out.println("会写PHP代码！");
    }
}