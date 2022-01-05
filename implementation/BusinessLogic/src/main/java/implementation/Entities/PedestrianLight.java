package implementation.Entities;

import api.LightState;
import api.TrafficLight;
import implementation.states.States;

public class PedestrianLight implements TrafficLight {

    private LightState currentState;
    private Behaviour country;

    public PedestrianLight(Behaviour country) {
        this.country = country;
        currentState = States.RED;
        System.out.println("Pedestrianlight in current state: " + currentState);
        System.out.println();
    }

    public PedestrianLight(LightState state, Behaviour country) {
        currentState = state;
        this.country = country;
    }

    @Override
    public void changeStateTo(LightState newState) {
        this.currentState = newState;
        System.out.println("Pedestrianlight switched to state: " + currentState);
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
