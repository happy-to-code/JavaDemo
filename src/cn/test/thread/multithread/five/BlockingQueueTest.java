package cn.test.thread.multithread.five;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2019/1/9
 */
public class BlockingQueueTest {
    private int size = 20;
    private ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(size);

    public static void main(String[] args) {
        BlockingQueueTest test = new BlockingQueueTest();
        Producer producer = test.new Producer();
        Consumer consumer = test.new Consumer();

        producer.start();
        consumer.start();
    }

    class Consumer extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    //从阻塞队列中取出一个元素
                    blockingQueue.take();
                    System.out.println("队列剩余" + blockingQueue.size() + "个元素");
                } catch (InterruptedException e) {

                }
            }
        }
    }

    class Producer extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    //向阻塞队列中插入一个元素
                    blockingQueue.put(1);
                    System.out.println("队列剩余空间：" + (size - blockingQueue.size()));
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
