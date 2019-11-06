package cn.test2.proxy.test2;

class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("request");
    }
}