package design_pattern.observer;

/**
 * Observer
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-09-17 19:30
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "16进制-Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
