package cn.test.designpatterns.factory.simple;

/**
 * main方法
 */
public class BossSimplyFactory {

    public static void main(String[] args) {
        BaseCar car = Driver.createCar("benz");
        car.setName("benz");
        car.drive();
    }
}