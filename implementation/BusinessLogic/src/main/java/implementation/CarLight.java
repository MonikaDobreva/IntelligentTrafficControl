package implementation;

import api.LightState;
import api.TrafficLight;
import implementation.states.GreenState;

public class CarLight implements TrafficLight {

    LightState currentState;

    public CarLight() {
        currentState = new GreenState(this);
    }

    public CarLight(LightState state) {
        currentState = state;
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
