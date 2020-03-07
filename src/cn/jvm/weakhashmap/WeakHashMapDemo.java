package cn.jvm.weakhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author sherman
 * WeakHashMap和HashMap一样也是一个散列表，但是它的键是“弱键”，
 * 其类型是WeakReference，对于“弱键”，其对应的映射的存在并不会阻止垃圾回收器对该键的丢弃，
 * 也就是说，该弱键是可被终止的。当某个键被终止时，其对应的键值对映射就会从散列表中移除：
 */
public class WeakHashMapDemo {

    public static void main(String[] args) {
        Map<Integer, Object> weakHashMap = new WeakHashMap<>();
        Map<Integer, Object> hashMap = new HashMap<>();

        /**
         * 注意这里两个map不能共用一对key-value，会相互影响
         */
        Integer key1 = new Integer(250);
        String value1 = "weakHashMap";
        weakHashMap.put(key1, value1);

        Integer key2 = new Integer(250);
        String value2 = "hashMap";
        hashMap.put(key2, value2);

        System.out.println("weakHashMap: " + weakHashMap);
        System.out.println("hashMap: " + hashMap);
        key1 = null;
        key2 = null;
        System.gc();
        System.out.println("==========================");
        System.out.println("weakHashMap: " + weakHashMap);
        System.out.println("hashMap: " + hashMap);
    }
}
