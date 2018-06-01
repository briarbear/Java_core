package concurrent.volatile_demo;

/**
 * valatile 变量自增运算测试 无法保证线程安全，因为自增操作并非原子性
 */
public class VolatileTest {

    public static volatile int race = 0;

    public static void increase(){
        race++;
    }

    private static final int THREADS_COUNT = 20;


    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread( () -> {
                for (int j = 0; j < 1000; j++) {
                    increase();
                }
            } );
            threads[i].start();
        }

        //等待所有累加线程都结束
        while (Thread.activeCount() > 2){
            Thread.yield();
        }
            System.out.println(race);
    }
}



/**
 * 单例模式中的懒汉式 - 双重检测+volatile终极版本
 */
class Singleton{

    private volatile static Singleton instance = null;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null)
                    instance = new Singleton();
            }
        }

        return instance;
    }
}


/**
 * volatile 变量的应用场景
 */
class VolatileFlag{

    volatile boolean flag  = false;
    /**
     * 1. 状态标记量
     */

    public  void Test1(){

        while (!flag){
            System.out.println("do somethings");
        }

    }

    public void setFlag() {
        flag = true;
    }

}


class Test{
    public static void main(String[] args) {
        System.out.println("xiongzp08");
    }
}



