package concurrent.thread_local;

/**
 * http://ifeve.com/java-threadlocal%E7%9A%84%E4%BD%BF%E7%94%A8/
 */
public class ThreadLocalExample {

    public static class MyRunnable implements Runnable{
        //ThreadLocal变量
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
        public void run() {
            threadLocal.set((int)(Math.random() * 1000));
            try {
                Thread.sleep(2000); //休眠2秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(threadLocal.get());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread1.start();
        thread2.start();

        thread1.join();  //等待线程终止
        thread2.join();
    }
}
