package concurrent.blockqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerExample {
    public static void main(String[] args) throws InterruptedException {
        int numProducers = 4;
        int numConsumers = 3;

        BlockingQueue<Object> queue = new LinkedBlockingDeque<>(20);
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
}
