package design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @date 2018-09-17 19:07
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;
    public int getState(){
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer o : observers) {
            o.update();
        }
    }

}
