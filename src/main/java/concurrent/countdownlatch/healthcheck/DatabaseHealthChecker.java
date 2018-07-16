package concurrent.countdownlatch.healthcheck;

import java.util.concurrent.CountDownLatch;

/**
 * 这个类继承了 BaseHealthChecker，实现了 verifyService() 方法。DatabaseHealthChecker.java 和 CacheHealthChecker.java 除了服务名和休眠时间外，与 NetworkHealthChecker.java 是一样的
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-16-14:31
 */
public class DatabaseHealthChecker extends BaseHealthChecker {

    public DatabaseHealthChecker(CountDownLatch latch) {
        super("Database service", latch);
    }

    @Override
    public void verifyService()
    {
        System.out.println("Checking " + this.getServiceName());
        try
        {
            Thread.sleep(7000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(this.getServiceName() + " is UP");
    }
}
