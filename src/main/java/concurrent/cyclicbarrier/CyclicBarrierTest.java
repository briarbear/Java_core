package concurrent.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-16-15:38
 */
public class CyclicBarrierTest {

    /**
     * CyclicBarrier同步屏障 它要做的事情是，让一组线程到达一个屏障（也可以叫同步点）时被阻塞，
     * 直到最后一个线程到达屏障时，屏障才会开门，所有别屏蔽的线程才会继续运行
     */

    static CyclicBarrier c = new CyclicBarrier(2);

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                c.await();
            } catch (Exception e) {

            }
            System.out.println(1);
        }).start();

        try {
            c.await();
        } catch (Exception e) {

        }
        System.out.println(2);
    }
}
