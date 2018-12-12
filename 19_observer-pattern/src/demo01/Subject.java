package demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:32 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class Subject {
    private List<Observer> observers=new ArrayList<>();
    private int state;

    public void attach(Observer observer){
        observers.add(observer);

    }
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
