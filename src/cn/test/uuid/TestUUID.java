package cn.test.uuid;

import java.util.UUID;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/6
 */
public class TestUUID {
    public static void main(String[] args) {
        System.out.println("UUID :"+ UUID.randomUUID().toString().trim().replace("-", ""));
    //    hello
    }
}
