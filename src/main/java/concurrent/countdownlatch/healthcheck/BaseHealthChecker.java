package concurrent.countdownlatch.healthcheck;

import java.util.concurrent.CountDownLatch;

/**
 * 这个类是一个 Runnable，负责所有特定的外部服务健康的检测。它删除了重复的代码和闭锁的中心控制代码
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-16-14:22
 */
public abstract class BaseHealthChecker implements Runnable {
    private CountDownLatch _latch;
    private String _serviceName;
    private boolean _serviceUp;

    public BaseHealthChecker(String serviceName, CountDownLatch latch)
    {
        super();
        this._latch = latch;
        this._serviceName = serviceName;
        this._serviceUp = false;
    }

    @Override
    public void run() {
        try {
            verifyService();  //执行方法
            _serviceUp = true;
        } catch (Throwable t) {
            t.printStackTrace(System.err);
            _serviceUp = false;
        } finally {
            if(_latch != null) {
                _latch.countDown();   //计速器减去1
            }
        }

    }

    public String getServiceName() {
        return _serviceName;
    }

    public boolean isServiceUp() {
        return _serviceUp;
    }
    //This methos needs to be implemented by all specific service checker
    public abstract void verifyService();
}
