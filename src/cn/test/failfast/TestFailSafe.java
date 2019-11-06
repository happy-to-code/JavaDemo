package cn.test.failfast;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2019/3/16
 */
public class TestFailSafe {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> premiumPhone =
                new ConcurrentHashMap<>(16);
        premiumPhone.put("Apple", "iPhoneX");
        premiumPhone.put("HTC", "HTC  one");
        premiumPhone.put("Samsung", " S5");

        Iterator iterator = premiumPhone.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }

    }

}
