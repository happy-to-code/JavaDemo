package cn.test3.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/12
 */
public class Demo1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            queue.offer(i);
        }
        System.out.println(queue);

        /*
         * peek()：获取队首的元素（不删除该元素!）
         */
        System.out.println("peek():" + queue.peek());

        /*
         * poll()：从队列中取出元素，取得的是最早的 offer 元素，从队列中取出元素后，
         * 该元素会从队列中删除。若方法返回 null 说明 队列中没有元素了。
         */
        Integer integer;
        while ((integer = queue.poll()) != null) {
            System.out.print(integer);
        }

        System.out.println("\npeek():" + queue.peek());
    }
}
