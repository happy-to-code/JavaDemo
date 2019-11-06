package cn.test.reflection.two;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/22
 */
public class TestClass {
    private String MSG = "Original";

    private void privateMethod(String head, int tail) {
        System.out.print(head + tail);
    }

    public String getMsg() {
        return MSG;
    }
}
