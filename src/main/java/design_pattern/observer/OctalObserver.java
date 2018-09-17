package design_pattern.observer;

/**
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-09-17 19:27
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("8进制-Octal String:" + Integer.toOctalString(subject.getState()));
    }
}
