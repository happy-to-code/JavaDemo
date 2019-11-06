package cn.test.interceptor;

public class ClientDemo {
    public static void main(String args[]) {
        // 创建动态代理处理工具
        DynamicProxyHandler handler = new DynamicProxyHandler();

        // 创建业务组件对象
        BusinessFacade business = new BusinessClass();

        // 创建业务组件对象，并用动态代理绑定代理类
        BusinessFacade businessProxy = (BusinessFacade) handler.bind(business);

        // 调用业务组件中的方法，演示拦截器效果
        businessProxy.doSomething();
    }
}
