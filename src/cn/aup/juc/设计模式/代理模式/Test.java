package cn.aup.juc.设计模式.代理模式;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/15 21:12
 */
public class Test {
    public static void main(String[] args) {
        ProxyInterface proxyInterface = new WeddingCompany(new NormalHome());
        proxyInterface.marry();
    }
}
