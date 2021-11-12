package implementation.states;

import api.LightState;
import api.TrafficLight;

public class RedYellowState extends LightState {
    public RedYellowState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public LightState changeState() {
        return new GreenState(trafficLight);
    }

    @Override
    public String toString() {
        return "RedYellow";
    }

    public boolean equals(Object other){
        return this.getClass().equals(other.getClass());
    }
}
