package design_pattern.observer;

/**
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-09-17 19:32
 */
public class Demo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("first change to 15");
        subject.setState(15);

        System.out.println("second state chang: 10");
        subject.setState(10);
    }
}
