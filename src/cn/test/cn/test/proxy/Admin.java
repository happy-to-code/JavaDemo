package cn.test.cn.test.proxy;

/**
 * @Describle:真实主题类
 * @Author:zhangyifei
 * @Date:2018/5/15
 */
public class Admin implements Manager {

    @Override
    public void doSomething() {
        System.out.println("Admin do something");
    }
}
