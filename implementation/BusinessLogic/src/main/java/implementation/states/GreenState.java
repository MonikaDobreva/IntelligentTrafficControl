package implementation.states;

import api.LightState;
import api.TrafficLight;
import implementation.PedestrianLight;

public class GreenState extends LightState {

    public GreenState(TrafficLight trafficLight){
        super(trafficLight);
    }

    @Override
    public LightState changeState() {
        if(trafficLight.getClass().equals(PedestrianLight.class)){
            return new RedState(trafficLight);
        } else {
            return new YellowState(trafficLight);
        }
    }

    @Override
    public String toString() {
        return "Green";
    }
}
