package concurrent.countdownlatch.art_code;

/**
 * 使用join()方法
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-16-15:05
 */

public class JoinCountDownLatchTest {

    /**
     * join用于让当前执行线程等待join线程执行结束,其实现原理是不断检查join线程是否存活,
     * 如果join线程存活则让当前线程永远等待
     *
     */

    public static void main(String[] args) throws InterruptedException {

        Thread parser1 = new Thread(()-> System.out.println("parser1 finish"));

        Thread parser2 = new Thread(() -> System.out.println("parser2 finish"));

        parser1.start();
        parser2.start();
        parser1.join();
        parser2.join();

        System.out.println("all parser finish");
    }
}
