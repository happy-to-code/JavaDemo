package cn.aup.juc.list高级.api;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/5 22:12
 * 四组API：
 * <p>
 * **抛出异常组：
 * -----add()：当阻塞队列满时，抛出异常
 * -----remove()：当队列为空时，抛出异常
 * ------element()：取出队列开头元素
 * ===============================================================================
 * **null&false返回值：
 * ----offer()：当阻塞队列满时，返回false
 * ----poll()：当阻塞队列为空时，返回null
 * ----peek()：返回阻塞队列开头元素，如果队列为空，返回null
 * ===============================================================================
 * **一直阻塞：
 * ----put()：当阻塞队列满时，队列会一直阻塞直到队列有数据被拿走或者响应中断
 * ----take()：当阻塞队列为空时，队列会一直阻塞直到队列中有新数据被放入或者响应中断
 * ===============================================================================
 * **超时退出：
 * -----offer(e, time, unit)：当阻塞队列满时，会阻塞生产者线程一段时间，超出时间限制后生产者线程退出
 * -----poll(time, unit)：当阻塞队列为空时，会阻塞消费者线程一段时间，超出时间限制后消费者线程退出
 */
public class BlockingQueueAPIDemo {
    public static void main(String[] args) throws InterruptedException {
        // 创建一个容量为2的阻塞队列---》队列是FIFO  先进新出
        BlockingQueue blockingQueue = new ArrayBlockingQueue(2);

        // api1的测试
        // api1(blockingQueue);

        // api2的测试
        // api2(blockingQueue);

        // api3的测试
        // api3(blockingQueue);

        // api4的测试
        api4(blockingQueue);

    }

    private static void api4(BlockingQueue blockingQueue) throws InterruptedException {
        // * -----offer(e, time, unit)：当阻塞队列满时，会阻塞生产者线程一段时间，超出时间限制后生产者线程退出
        // * -----poll(time, unit)：当阻塞队列为空时，会阻塞消费者线程一段时间，超出时间限制后消费者线程退出
        blockingQueue.offer("12");
        blockingQueue.offer("13");
        blockingQueue.offer("14", 2, TimeUnit.SECONDS);
        System.out.println("----------------");

        blockingQueue.poll();
        blockingQueue.poll();
        blockingQueue.poll(1, TimeUnit.SECONDS);

    }

    private static void api3(BlockingQueue blockingQueue) throws InterruptedException {
        // * ----put()：当阻塞队列满时，队列会一直阻塞直到队列有数据被拿走或者响应中断
        // *----take()：当阻塞队列为空时，队列会一直阻塞直到队列中有新数据被放入或者响应中断
        blockingQueue.put("1");
        blockingQueue.put("1");
        // blockingQueue.put("1");

        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());

    }

    private static void api2(BlockingQueue blockingQueue) {
        // ----offer()：当阻塞队列满时，返回false
        // ---- poll()：当阻塞队列为空时，返回null
        // ----peek()：返回阻塞队列开头元素，如果队列为空，返回null
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));

        // System.out.println(blockingQueue.poll());
        // System.out.println(blockingQueue.poll());
        // System.out.println(blockingQueue.poll());

        System.out.println(blockingQueue.peek());


    }

    private static void api1(BlockingQueue blockingQueue) {
        // *-----add()：当阻塞队列满时，抛出异常
        // * -----remove()：当队列为空时，抛出异常
        // * ------element()：取出队列开头元素
        System.out.println(blockingQueue.add("1"));
        System.out.println(blockingQueue.add("2"));
        // 此时直接报错，因为超出容量
        // System.out.println(blockingQueue.add("3"));
        // 取出队列开头元素
        System.out.println(blockingQueue.element());
        System.out.println(blockingQueue.element());

        //  删除元素
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        // System.out.println(blockingQueue.remove());
    }
}
