package design_pattern.observer;

/**
 * 观察者 抽象类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-09-17 19:11
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
