package cn.designpatterns.工厂方法模式.抽象工厂方法模式;

import cn.designpatterns.工厂方法模式.抽象工厂方法模式.factory.AbstractFactory;
import cn.designpatterns.工厂方法模式.抽象工厂方法模式.factory.ColorFactory;
import cn.designpatterns.工厂方法模式.抽象工厂方法模式.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
