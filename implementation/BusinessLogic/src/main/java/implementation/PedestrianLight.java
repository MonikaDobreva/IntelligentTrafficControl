package implementation;

import api.LightState;
import api.TrafficLight;
import implementation.states.RedState;

import java.util.EventListener;

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
    public String toString() {
        return currentState.toString();
    }
}
