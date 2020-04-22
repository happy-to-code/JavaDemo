package cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.sharpimpl;

import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
