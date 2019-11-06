package cn.test.stream.test3;

import java.util.Optional;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/7/24
 */
public class Test {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());

    }
}
