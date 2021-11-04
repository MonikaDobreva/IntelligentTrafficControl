package implementation;

import api.LightState;
import api.TrafficLight;
import implementation.states.RedState;

import java.util.EventListener;
import java.util.Timer;

public class PedestrianLight implements TrafficLight {

    LightState currentState;

    public PedestrianLight() {
        currentState = new RedState(this);
    }

    @Override
    public void changeState() {
        currentState = currentState.changeState();
    }

    @Override
    public void update() {

    }

    @Override
    public void cycle() throws InterruptedException{
        Timer t = new Timer();
        t.wait(20000);
        changeState();
        t.wait(10000);
        changeState();
    }

    @Override
    public String toString() {
        return currentState.toString();
    }
}
