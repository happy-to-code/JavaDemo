package cn.aup.juc.设计模式.代理.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaotaiJiu maotaijiu = new MaotaiJiu();

        InvocationHandler jingxiao1 = new GuitaiA(maotaijiu);
        SellWine dynamicProxy = (SellWine) Proxy.newProxyInstance(MaotaiJiu.class.getClassLoader(),
                MaotaiJiu.class.getInterfaces(), jingxiao1);
        dynamicProxy.mainJiu();

    }

}
