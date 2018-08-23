package design_pattern.single;

/**
 * 单例模式的终极版本 双重检查 + 线程安全
 */
public class Single {

    private static volatile Single instance;

    private Single() {
    }

    public static Single getInstance(){
        if (instance == null){
            synchronized (Single.class){
                if (instance == null){
                    instance = new Single();
                }
            }
        }

        return instance;
    }
}
