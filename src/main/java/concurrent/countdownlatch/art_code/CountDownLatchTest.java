package concurrent.countdownlatch.art_code;

import java.util.concurrent.CountDownLatch;

/**
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-16-15:13
 */
public class CountDownLatchTest {

    /**
     * CountDownLacth的构造函数接受一个int类型的参数作为计数器,如果你想等待N个点完成,这里传入N
     * 当我们调用CountDownLacth的countDown方法时,N就会减1,CountDownLatch的await方法会阻塞当前线程,直到N变成0
     * 由于countDown方法可以用在任何其他地方,所以这里说的n个点,可以是N个线程,也可以是一个线程里面的N个步骤
     * 用在多线程时,只需要把这个CountDownLatch的引用传递到线程里即可
     * 如果一个线程执行过慢,还可以使用另外一个带指定时间的await方法,await(long time,TimeUint unit)
     */

    static CountDownLatch c = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            System.out.println(1);
            c.countDown();
            System.out.println(2);
            c.countDown();
        }).start();

        c.await();
        System.out.println("3");
    }
}
