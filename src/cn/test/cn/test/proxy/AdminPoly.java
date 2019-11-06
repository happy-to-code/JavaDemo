package cn.test.cn.test.proxy;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/5/15
 */
public class AdminPoly implements Manager {
    private Admin admin;

    public AdminPoly(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void doSomething() {
        System.out.println("Log:admin操作开始");
        admin.doSomething();
        System.out.println("Log:admin操作结束");
    }
}
