package cn.test3.leetcode.queue;

import java.lang.reflect.Array;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/11/26
 */
public class ArrayQueue1<T> {
    /**
     * 队列容器
     */
    private T[] array;

    /**
     * 队头指针
     */
    private int front;

    /**
     * 队尾指针
     */
    private int rear;

    /**
     * 构造函数
     *
     * @param capacity 队列容量
     */
    public ArrayQueue1(Class<T> type, int capacity) {
        //通过反射创建泛型数组
        this.array = (T[]) Array.newInstance(type, capacity);
    }

    public static void main(String[] args) throws Exception {
        ArrayQueue1<String> queue = new ArrayQueue1<>(String.class, 8);
        System.out.println("队列的容量为：" + queue.capacity());
        int i = 1;
        while (!queue.isFull()) {
            queue.enqueue("E" + (i++));
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

    }

    public int capacity() {
        return array.length;
    }

    public boolean isFull() {
        return (rear + 1) % array.length == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 元素入队
     *
     * @param element
     * @throws Exception
     */
    public void enqueue(T element) throws Exception {
        if ((rear + 1) % array.length == front) {
            throw new Exception("队列已经满了");
        }
        array[rear] = element;
        rear = (rear + 1) % array.length;
    }

    /**
     * 元素出队
     *
     * @return
     * @throws Exception
     */
    public T dequeue() throws Exception {
        if (rear == front) {
            throw new Exception("队列已经空空如也");
        }
        T element = array[front];
        front = (front + 1) % array.length;
        return element;
    }
}
