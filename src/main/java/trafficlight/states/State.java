package trafficlight.states;

//TODO implement a part of the pattern here
import trafficlight.Subject;
import trafficlight.gui.TrafficLight;

public abstract class State {

    public abstract State getNextState();

    public abstract String getColor();

    public String getSting(){
        return getColor();
    }

    public abstract void addObserver(TrafficLight yellow);

    public void notifyObserver() {
    }
}