package concurrent.semaphore;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 控制并发数量的Semophore
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-17-9:39
 */
public class SemophoreTest {

    private static final int THREAD_COUNT = 30;
    private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);  //新建线程池
    private static Semaphore s= new Semaphore(10);  //最多10个线程获得许可证

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadPool.execute(()->{
                try {
                    s.acquire();
                    System.out.println("save data");
                    s.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        threadPool.shutdown();

    }


}
