package cn.designpatterns.工厂方法模式.抽象工厂方法模式.factory;

import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.Color;
import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.Shape;
import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.colorimpl.Blue;
import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.colorimpl.Green;
import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.colorimpl.Red;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
