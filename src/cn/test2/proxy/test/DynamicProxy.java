package cn.test2.proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理的实现
 *
 * @author pjmike
 * @create 2018-08-04 17:42
 */
public class DynamicProxy {
    public static void main(String[] args) {
        IHelloImpl hello = new IHelloImpl();
        MyInvocationHandler handler = new MyInvocationHandler(hello);
        //获取目标用户的代理对象
        IHello proxyHello = (IHello) Proxy.newProxyInstance(IHelloImpl.class.getClassLoader(), IHelloImpl.class.getInterfaces(), handler);
        //调用代理方法
        proxyHello.sayHello();
    }
}

/**
 * 被访问者接口
 */
interface IHello {
    void sayHello();
}

/**
 * 被访问者的具体实现类
 */
class IHelloImpl implements IHello {

    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object target;

    /**
     * @param target 被代理的目标对象
     */
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 执行目标对象的方法
     *
     * @param proxy  代理对象
     * @param method 代理方法
     * @param args   方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke method");
        System.out.println("Method name : " + method.getName());
        Object result = method.invoke(target, args);
        return result;
    }
}
