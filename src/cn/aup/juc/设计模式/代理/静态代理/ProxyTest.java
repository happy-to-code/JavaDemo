package cn.aup.juc.设计模式.代理.静态代理;

public class ProxyTest {
    public static void main(String[] args) {
        RealMovie realmovie = new RealMovie();
        Movie movie = new Cinema(realmovie);
        movie.play();
    }
}
