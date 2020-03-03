package cn.juc.collection.list;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Describle:验证ArrayList线程不安全
 * @Author: zhangyifei
 * @Date: 2020/3/3
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>(10);
        // List<String> list = Collections.synchronizedList(new ArrayList<>(10));
        List<String> list = new CopyOnWriteArrayList<>();

        // java.util.ConcurrentModificationException
        for (int i = 0; i < 30; i++) {
            new Thread(String.valueOf(i)) {
                @Override
                public void run() {
                    list.add(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10));
                    System.out.println(list);
                }
            }.start();
        }
    }
}
