package cn.test.designpatterns.decorator.code.impl;


import cn.test.designpatterns.decorator.code.ProgramMonkey;

/**
 * Decorator（抽象装饰类）
 */
public class ProgramMonkeyDecorator implements ProgramMonkey {
    protected ProgramMonkey mProgramMonkey;

    public ProgramMonkeyDecorator(ProgramMonkey mProgramMonkey) {
        this.mProgramMonkey = mProgramMonkey;
    }

    @Override
    public void skills() {
        mProgramMonkey.skills();
    }
}