package concurrent.synchronize;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 同样是买票问题 尝试使用原子类 + volatile 解决
 */
public class SynchronizeExample2 {

    public static void main(String[] args) {

        int windows = 10;

        for (int i = 0; i < windows; i++) {
            Thread thread = new Thread(new Sale());
            thread.setName(i+1+"号窗口");
            thread.start();
        }


    }
}

class Sale implements Runnable{
    //保证count的自增操作的原子性，使用volatile保证共享变量的可见性
    private static volatile AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        int temp =count.get();
        while (temp <= 1000){
            temp = count.getAndIncrement();
            if (temp < 1000){
                System.out.println("第"+Thread.currentThread().getName()+"在卖第"+(temp+1)+"张票");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("第"+Thread.currentThread().getName()+"的票已经卖完");
    }
}
