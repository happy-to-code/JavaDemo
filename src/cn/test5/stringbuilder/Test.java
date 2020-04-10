package cn.test5.stringbuilder;

import java.util.Arrays;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/4/7 15:27
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "dd", "cc", "vf");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                sb.append(list.get(i));
            } else {
                sb.append(",").append(list.get(i));
            }
        }
        System.out.println("sb = " + sb);

    }
}
