package concurrent.blockqueue;

import java.util.concurrent.BlockingQueue;

/**
 * 消费者
 */
public class Consumer implements Runnable {
    protected BlockingQueue<Object> queue;

    public Consumer(BlockingQueue<Object> queue) {
        this.queue = queue;

    }

    @Override
    public void run() {
        while (true){
            try {
                Object object = queue.take(); //从队列中取
                System.out.println("consumed resource... the queue size is" + queue.size());
                take(object);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void take(Object obj){
        try {
            Thread.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("comsuming object " + obj);

    }
}
