package concurrent.blockqueue;

import java.util.concurrent.BlockingQueue;

/**
 * 生产者
 */
public class Producer implements Runnable {

    protected BlockingQueue<Object> queue;

    public Producer(BlockingQueue<Object> queue) {
        this.queue = queue;
    }


    //生产者创建一个资源（Object对象）并将它存入到队列中，如果队列已满，它将会等待到消费者线程从队列中取走资源，所以队列长度永远不会超过20
    @Override
    public void run() {
        while (true){
            Object object = getResource();
            try {
                queue.put(object);
                System.out.println("Produced resource...the queue size is " + queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //生产对象
    Object getResource(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Object();
    }
}
