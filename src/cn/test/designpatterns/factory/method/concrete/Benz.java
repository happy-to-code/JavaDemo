package cn.test.designpatterns.factory.method.concrete;

import cn.test.designpatterns.factory.method.abs.Car;

//具体产品
class Benz extends Car {
    @Override
    public void drive(){
        System.out.println(this.getName()+"----go-----------------------1");
    }  
}  