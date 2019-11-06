package cn.test.designpatterns.factory.method.concrete;

import cn.test.designpatterns.factory.method.abs.Car;
import cn.test.designpatterns.factory.method.abs.Driver;

class BmwDriver extends Driver {
    @Override
    public Car createCar(String car) {
        return new Bmw();
    }
}  