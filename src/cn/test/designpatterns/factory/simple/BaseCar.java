package cn.test.designpatterns.factory.simple;

/**
 * 抽象产品
 */
public abstract class BaseCar {
    private String name;

    public abstract void drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}  