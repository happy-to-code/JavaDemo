package cn.aup.juc.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Describle:验证ArrayList线程不安全
 * @Author: zhangyifei
 * @Date: 2020/3/3
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // 这边是不安全的
        List<String> list = new ArrayList<>(10);

        // 下面两种是安全的，当然用vector也是安全的，但是vector没有下面两种效率高
        // List<String> list = Collections.synchronizedList(new ArrayList<>(10));
        // List<String> list = new CopyOnWriteArrayList<>();

        // 并发修改异常 java.util.ConcurrentModificationException
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
