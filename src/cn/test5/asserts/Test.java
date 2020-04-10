package cn.test5.asserts;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/1 16:18
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        assert a > b : "错误,a不大于b";
    }
}
