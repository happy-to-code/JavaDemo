package cn.test5.shortt;

import java.util.StringJoiner;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/13 14:53
 */
public class Test {
    private  Short s;

    public Short getS() {
        return s;
    }

    public void setS(Short s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Test.class.getSimpleName() + "[", "]")
                .add("s=" + s)
                .toString();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setS((short) 1);
        System.out.println(test);
    }
}
