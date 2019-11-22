package cn.test3.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/12
 */
public class Demo3 {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>(8);

        map.put("code", 1);

        List<String> list = new ArrayList<>(10);
        list.add("张三");
        list.add("李四");
        list.add("王五");



        map.put("sales", list);

        System.out.println(map);

        String str = "1212sfdf兜底销售!";

        boolean boo = str.endsWith("兜底销售");
        System.out.println(boo);


    }
}
