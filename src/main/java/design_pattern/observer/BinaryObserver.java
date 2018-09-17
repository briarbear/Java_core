package design_pattern.observer;

/**
 * 实体观察者类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-09-17 19:23
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("2进制-Binary String:" + Integer.toBinaryString(subject.getState()));
    }


}
