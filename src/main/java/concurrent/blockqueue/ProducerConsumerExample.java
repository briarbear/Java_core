package concurrent.blockqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 测试启动类
 * 分别启动4个生成者线程，3个消费者线程
 * 生产者不断添加对象到队列中，消费者不断从队列中取出
 * 运行10s后，程序退出
 */
public class ProducerConsumerExample {
    public static void main(String[] args) throws InterruptedException {
        int numProducers = 4; //生产者数量
        int numConsumers = 3; //消费者数量
        //使用LinkedBlockingDeque - 一个由链表结构组成的双向阻塞队列
//        BlockingQueue<Object> queue = new LinkedBlockingDeque<>(20);
        BlockingQueue<Object> queue = new LinkedBlockingQueue<>(20); //也可以使用链表阻塞队列
        //分别启动生产者、消费者
        for (int i = 0; i < numProducers; i++) {
            new Thread(new Producer(queue)).start();
        }

        for (int i = 0; i < numConsumers; i++) {
            new Thread(new Consumer(queue)).start();
        }

        Thread.sleep(10*1000);
        Thread.yield();
        System.exit(0);
    }

    Exception
}
