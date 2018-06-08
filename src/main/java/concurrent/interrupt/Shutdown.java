package concurrent.interrupt;

import java.util.concurrent.TimeUnit;

/**
 * 4.2.5 安全地终止线程
 * 该示例在执行过程中，main线程通过中断操作和cancel()方法均可使CountThread得以终止
 * 这种通过标识位或者中断操作的方式能够使线程在终止时有机会去清理资源，
 * 而不是武断地将线程终止，因此这种终止线程的做法显得更加安全和优雅
 */
public class Shutdown {

    public static void main(String[] args) throws InterruptedException {
        Runner one = new Runner();
        Thread countThread = new Thread(one);
        countThread.start();

        //睡眠一秒
        TimeUnit.SECONDS.sleep(1);
        countThread.interrupt();

        Runner two = new Runner();
        countThread = new Thread(two,"CountTHread");
        countThread.start();

        TimeUnit.SECONDS.sleep(1);
        two.cancel(); //通过调用其类的volatile变量，停止线程

    }


    private static class Runner implements Runnable{
        private long i;
        private volatile boolean on = true;
        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()){
                //布尔值处于true且当前线程未被打断
                i++;
            }
            System.out.println("Count i = " + i);
        }

        public void cancel(){
            on = false;
        }
    }
}


