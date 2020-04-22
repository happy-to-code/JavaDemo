package cn.test.designpatterns.factory.simple.concrete;

import cn.test.designpatterns.factory.simple.BaseCar;

public class Bmw extends BaseCar {
    @Override
    public void drive() {
        System.out.println(this.getName() + "----go-----------------------");
    }
}  
