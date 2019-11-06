package cn.test.cn.test.proxy;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/5/15
 */
public class TestProxy {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Manager m = new AdminPoly(admin);
        m.doSomething();
    }
}
