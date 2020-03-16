package cn.aup.juc.设计模式.代理模式;

public class NormalHome implements ProxyInterface {
    @Override
    public void marry() {
        System.out.println("我们结婚啦～");
    }
}
