package cn.test.designpatterns.factory.method;

import cn.test.designpatterns.factory.method.abs.Car;
import cn.test.designpatterns.factory.method.abs.Driver;
import cn.test.designpatterns.factory.method.concrete.BenzDriver;

public class Boss {
    public static void main(String[] args) throws Exception {
        Driver d = new BenzDriver();
        Car c = d.createCar("benz");
        c.setName("benz");
        c.drive();
    }
} 