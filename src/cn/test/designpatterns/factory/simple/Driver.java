package cn.test.designpatterns.factory.simple;

import cn.test.designpatterns.factory.simple.concrete.Benz;
import cn.test.designpatterns.factory.simple.concrete.Bmw;

/**
 * 简单工厂
 */
class Driver {
    public static BaseCar createCar(String car) {
        BaseCar c = null;
        if ("Benz".equalsIgnoreCase(car)) {
            c = new Benz();
        } else if ("Bmw".equalsIgnoreCase(car)) {
            c = new Bmw();
        }
        return c;
    }
}  