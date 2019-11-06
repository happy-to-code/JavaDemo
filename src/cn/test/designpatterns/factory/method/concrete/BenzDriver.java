package cn.test.designpatterns.factory.method.concrete;

import cn.test.designpatterns.factory.method.abs.Car;
import cn.test.designpatterns.factory.method.abs.Driver;

//具体工厂（每个具体工厂负责一个具体产品）
public class BenzDriver extends Driver {
    @Override
    public Car createCar(String car) {
        return new Benz();
    }
} 