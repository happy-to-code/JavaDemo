package cn.test3.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Limi
 * 栈 （Deque） 双端队列  先进后出
 */
public class Demo05 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        for (int i = 1; i < 6; i++) {
            //压入，向栈中存入数据。
            deque.push(i + "");
        }
        System.out.println(deque);
        /*
         * peek：获取栈顶位置的元素，但不取出。
         * 注意事项： 我们在使用 pop 获取栈顶元素之前， 应现使用 peek 方法获取该元素，
         * 确定该元素不为 null 的情况下才应该将该元素从栈中弹出” ， 否则若栈中没有元
         * 素后，我们调用 pop 会抛出异常“NoSuchElementException” 。
         */
        while (deque.peek() != null) {
            //pop:弹出，从栈中取出数据。
            System.out.print(deque.pop());
        }

        System.out.println("\n" + deque);
    }

}