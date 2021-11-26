package implementation.Entities;

import api.LightState;
import api.TrafficLight;
import implementation.states.States;

public class CarLight implements TrafficLight {

    private LightState currentState;
    private Behaviour country;

    public CarLight(Behaviour country) {
        this.country = country;
        currentState = States.GREEN;
    }

    public CarLight(LightState state, Behaviour country) {
        currentState = state;
        this.country = country;
    }

    @Override
    public void changeStateTo(LightState newState) {
        this.currentState = newState;
    }

    @Override
    public LightState getState() {
        return currentState;
    }

    @Override
    public void switching() throws InterruptedException {
        country.executeBehaviour(this);
    }

    @Override
    public String toString() {
        return currentState.toString();
    }
}
