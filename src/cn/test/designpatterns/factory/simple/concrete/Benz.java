package cn.test.designpatterns.factory.simple.concrete;

import cn.test.designpatterns.factory.simple.BaseCar;

/**
 * 具体产品
 */
public class Benz extends BaseCar {
    @Override
    public void drive() {
        System.out.println(this.getName() + "----go-----------------------");
    }
}  