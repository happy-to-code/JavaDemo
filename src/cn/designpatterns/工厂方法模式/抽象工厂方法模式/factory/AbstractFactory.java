package cn.designpatterns.工厂方法模式.抽象工厂方法模式.factory;

import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.Color;
import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
