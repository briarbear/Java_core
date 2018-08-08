package concurrent.semaphore;

import java.util.Stack;
import java.util.concurrent.Semaphore;

/**
 * 排队买奶茶
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-08-08 20:41
 */
public class Semaphore2 {

    /**
     * X开了一间卖酸奶的小店，小店一次只能容纳5个顾客挑选购买，超过5个就需要排队啦~~
     */

    public static void main(String[] args) {
        // 假设有50个人同时来到奶茶店排队
        int num = 50;


        //奶茶店最终容纳10人
        Semaphore semaphore = new Semaphore(10);

        for (int i = 0; i < num; i++) {
            int finalI = i;
            new Thread(()->{
                try {
                    //有”号“的顾客才能进奶茶店购买
                    semaphore.acquire();
                    System.out.println("顾客"+(finalI+1)+"在挑选商品，购买...");
                    //挑选，购买
                    Thread.sleep(1000);
                    //归还许可号，
                    System.out.println("顾客"+(finalI+1)+"购买完毕...");
                    semaphore.release();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
