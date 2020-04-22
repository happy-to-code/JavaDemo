package cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.sharpimpl;

import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
