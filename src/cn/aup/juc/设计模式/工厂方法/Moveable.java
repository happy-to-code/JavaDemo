package cn.aup.juc.设计模式.工厂方法;

// 抽象产品角色
public interface Moveable {
    void run();
}

// 具体产品角色
class Plane implements Moveable {
    @Override
    public void run() {
        System.out.println("plane....");
    }
}

class Broom implements Moveable {
    @Override
    public void run() {
        System.out.println("broom.....");
    }
}

// 抽象工厂
abstract class VehicleFactory {
    abstract Moveable create();
}

// 具体工厂
class PlaneFactory extends VehicleFactory {
    @Override
    public Moveable create() {
        return new Plane();
    }
}

class BroomFactory extends VehicleFactory {
    @Override
    public Moveable create() {
        return new Broom();
    }
}

// 测试类
class Test {
    public static void main(String[] args) {
        VehicleFactory factory = new BroomFactory();
        Moveable m = factory.create();
        m.run();
    }
}
