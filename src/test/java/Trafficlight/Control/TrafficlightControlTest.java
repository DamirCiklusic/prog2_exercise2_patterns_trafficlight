package Trafficlight.Control;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.states.State;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficlightControlTest {

    @Test
    @DisplayName("Next state green")
    public void getNextStateTest_green(){
        TrafficLightCtrl tlc = new TrafficLightCtrl();
        State current = tlc.getGreenState();
        State actual = current.getNextState();
        assertEquals(tlc.getYellowState(), actual);
    }

    @Test
    @DisplayName("Next state yellow")
    public void getNextStateTest_yellow(){
        TrafficLightCtrl tlc = new TrafficLightCtrl();
        State current = tlc.getYellowState();
        State actual = current.getNextState();
        assertEquals(tlc.getGreenState(), actual);
    }

    @Test
    @DisplayName("Next state red")
    public void getNextStateTest_red(){
        TrafficLightCtrl tlc = new TrafficLightCtrl();
        State current = tlc.getRedState();
        State actual = current.getNextState();
        assertEquals(tlc.getYellowState(), actual);
    }
}
