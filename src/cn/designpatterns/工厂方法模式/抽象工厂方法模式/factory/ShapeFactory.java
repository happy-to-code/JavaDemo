package cn.designpatterns.工厂方法模式.抽象工厂方法模式.factory;

import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.Color;
import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.Shape;
import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.sharpimpl.Circle;
import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.sharpimpl.Rectangle;
import cn.designpatterns.工厂方法模式.抽象工厂方法模式.service.sharpimpl.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
