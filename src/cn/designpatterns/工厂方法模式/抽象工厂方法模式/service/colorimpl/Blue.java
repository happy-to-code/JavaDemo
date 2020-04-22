package cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.colorimpl;

import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
