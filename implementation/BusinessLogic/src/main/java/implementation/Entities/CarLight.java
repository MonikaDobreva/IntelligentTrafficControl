package implementation.Entities;

import api.LightState;
import api.TrafficLight;
import implementation.states.States;

/**
 * A traffic light for cars. Can display the colors RED, YELLOW and GREEN
 */
public class CarLight implements TrafficLight {

    private LightState currentState;
    private Behaviour country;

    public CarLight(Behaviour country) {
        this.country = country;
        currentState = States.GREEN;
        System.out.println("Carlight in current state: " + currentState);
        System.out.println();
    }

    public CarLight(LightState state, Behaviour country) {
        currentState = state;
        this.country = country;
    }

    @Override
    public void changeStateTo(LightState newState) {
        this.currentState = newState;
        System.out.println("Carlight switched to state: " + currentState);
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
