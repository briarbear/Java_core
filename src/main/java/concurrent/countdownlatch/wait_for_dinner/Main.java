package concurrent.countdownlatch.wait_for_dinner;

import java.util.concurrent.CountDownLatch;

/**
 * 闭锁 CountDownLatch 之一家人一起吃个饭
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-16-14:52
 */
public class Main {

    private static CountDownLatch latch = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            System.out.println("father waiting");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
        }).start();
        new Thread(() -> {
            System.out.println("mather waiting");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
        }).start();
         new Thread(() -> {
            System.out.println("i waiting");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
        }).start();

        latch.await();

        System.out.println("大家到齐,开始吃饭");
    }
}
