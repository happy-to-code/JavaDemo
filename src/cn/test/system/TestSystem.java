package cn.test.system;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/12
 */
public class TestSystem {
    static {
        setValue();
    }

    public static void setValue() {
        System.setProperty("name", "张三");
        System.setProperty("age", "28");
    }

    public static void main(String[] args) {
        // 得到当前目录
        String s = System.getProperty("user.dir");
        System.out.println(s);
        System.out.println("=============================");
        System.out.println(System.getProperty("name"));
        System.out.println(System.getProperty("age"));
        System.out.println("--------------------------------");
        // java版本
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.class.path"));

    }
}
