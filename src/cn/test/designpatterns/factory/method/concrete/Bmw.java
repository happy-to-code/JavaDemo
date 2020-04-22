package cn.test.designpatterns.factory.method.concrete;

import cn.test.designpatterns.factory.method.abs.Car;

class Bmw extends Car {
    @Override
    public void drive() {
        System.out.println(this.getName() + "----go-----------------------1");
    }
} 
