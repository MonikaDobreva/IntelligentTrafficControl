package api;

import java.util.EventListener;

public interface TrafficLight extends EventListener {

//    void changeState();

    void changeStateTo(LightState newState);

    LightState getState();

    void switching() throws InterruptedException;
}
