package cn.test.stream.test2;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        final String text = "pppadaad";
        Optional.ofNullable(text)//显示创建一个Optional壳
                .map(Test::print)
                .map(Test::print)
                .ifPresent(System.out::println);

        // Optional.ofNullable(text)
        //         .map(s -> {
        //             System.out.println(s);
        //             return s.substring(6);
        //         })
        //         .map(s -> null)//返回 null
        //         .ifPresent(System.out::println);
    }

    // 打印并截取str[5]之后的字符串
    private static String print(String str) {
        // System.out.println(str);
        return str.substring(6);
    }
}