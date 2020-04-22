package cn.test.interceptor;

/**
 * 业务组件接口的实现类
 */
public class BusinessClass implements BusinessFacade {
    @Override
    public void doSomething() {
        System.out.println("在业务组件 BusinessClass 中调用方法: doSomething()");
    }
}
