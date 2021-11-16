package implementation.states;

import api.LightState;
import api.TrafficLight;

public class YellowState extends LightState {
    public YellowState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public LightState changeState() {
        return new RedState(trafficLight);
    }

    @Override
    public String toString() {
        return "Yellow";
    }

    public boolean equals(Object other){
        return this.getClass().equals(other.getClass());
    }
}
