package concurrent.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-16-16:03
 */
public class CyclicBarrierTest3 {
    static CyclicBarrier c = new CyclicBarrier(2);

    public static void main(String[] args){
        Thread thread = new Thread(() -> {
            try {
                c.await();
            } catch (Exception e) {
            }
        });
        thread.start();
        thread.interrupt();  //中断thread
        try {
            c.await();
        } catch (Exception e) {
            System.out.println(c.isBroken());
        }
    }
}
