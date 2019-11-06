package cn.test2.fin;

import java.util.ArrayList;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/8/22
 */
public class Test {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(10);
        str.clear();
        try {
            // do something
            System.exit(1);
        } finally {
            System.out.println("Print from finally");
        }

    }
}
