package cn.test5.instanceof1;

import cn.test4.dump.User;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/22 14:48
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(11L);
        System.out.println("user = " + user);
        System.out.println(user instanceof User);
        // user = null;
        System.out.println((Object) null);
        System.out.println(null instanceof User);
        System.out.println(user instanceof Object);
    }
}
