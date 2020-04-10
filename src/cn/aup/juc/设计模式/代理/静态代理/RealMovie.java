package cn.aup.juc.设计模式.代理.静态代理;

public class RealMovie implements Movie {

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("您正在观看电影 《肖申克的救赎》");
    }
}
