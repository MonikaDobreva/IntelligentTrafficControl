package implementation.states;

import api.LightState;
import api.TrafficLight;
import implementation.PedestrianLight;

public class RedState extends LightState {

    public RedState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public LightState changeState() {
        if(trafficLight.getClass().equals(PedestrianLight.class)){
            return new GreenState(trafficLight);
        } else {
            return new RedYellowState(trafficLight);
        }
    }

    @Override
    public String toString() {
        return "Red";
    }

}
