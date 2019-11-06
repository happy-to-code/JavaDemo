package cn.test.failfast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2019/3/16
 */
public class TestFailFast {
    public static void main(String[] args) {
        Map<String, String> premiumPhone = new HashMap<>(16);
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung", "S5");

        Iterator iterator = premiumPhone.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }

    }

}
