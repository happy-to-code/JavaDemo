package cn.test.designpatterns.decorator;

import cn.test.designpatterns.decorator.code.PatternDecorator;
import cn.test.designpatterns.decorator.code.ProgramMonkey;
import cn.test.designpatterns.decorator.code.impl.AndroidProgramMonkey;
import cn.test.designpatterns.decorator.code.impl.PHPProgramMonkey;

public class Main {
    public static void main(String[] args) {
        //有一个Android程序猿只会写Android代码
        ProgramMonkey programMonkey = new AndroidProgramMonkey();
        // programMonkey.skills();
        //装饰一下他，装逼的技能，他竟然除了写Android还懂设计模式
        programMonkey = new PatternDecorator(programMonkey);
        programMonkey.skills();
        System.out.println("000-------------");
        programMonkey = new PHPProgramMonkey();
        programMonkey.skills();
    }
}