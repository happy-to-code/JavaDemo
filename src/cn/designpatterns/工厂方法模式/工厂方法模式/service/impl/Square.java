package cn.designpatterns.工厂方法模式.工厂方法模式.service.impl;

import cn.designpatterns.工厂方法模式.工厂方法模式.service.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
