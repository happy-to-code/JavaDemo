package cn.test.designpatterns.decorator.code;

import cn.test.designpatterns.decorator.code.impl.ProgramMonkeyDecorator;


/**
 * ConcreteDecorator（具体装饰类）
 */
public class PatternDecorator extends ProgramMonkeyDecorator {
    public PatternDecorator(ProgramMonkey mProgramMonkey) {
        super(mProgramMonkey);
    }

    @Override
    public void skills() {
        super.skills();
        System.out.println("会设计模式！");
    }
}