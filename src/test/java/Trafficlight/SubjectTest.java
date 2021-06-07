package Trafficlight;

import org.junit.jupiter.api.DisplayName;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import trafficlight.Observer;
import trafficlight.Subject;


public class SubjectTest {


    @Test
    @DisplayName("addObserver")
    public void addObserverTest() {
        try {
            Method m = Subject.class.getMethod("addObserver", Observer.class);
        } catch (Exception e) {
            e.printStackTrace();
            fail("addObserver function missing");

        }
    }

    @Test
    @DisplayName("removeObserver Test")
    public void removeObserverTest() {
        try{
            Method m = Subject.class.getMethod("removeObserver", Observer.class);
        } catch (Exception e) {
            e.printStackTrace();
            fail("removeObserver function missing");
        }

    }
}
