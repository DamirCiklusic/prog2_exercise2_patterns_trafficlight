package trafficlight;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer){ observerList.add(observer);}

    public void removeObserver(Observer observer) { observerList.remove(observer);}

    public void notifyObserver(){
        for (Observer o: observerList){
            o.update();
        }
    }

    public List<Observer> getObserverList() {
        return this.observerList;
    }
}
