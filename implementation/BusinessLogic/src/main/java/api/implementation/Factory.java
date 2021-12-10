package api.implementation;

import api.CrossingInterface;
import api.LightState;
import api.implementation.Entities.*;
//import implementation.Entities.*;
import api.TrafficLight;

public class Factory {

    static Factory getFactory(){
        return new Factory();
    }

    public TrafficLight createPedestrianLight(Behaviour country){
        return new PedestrianLight(country);
    }

    public TrafficLight createPedestrianLight(LightState state, Behaviour country){
        return new PedestrianLight(state, country);
    }

    public TrafficLight createCarLight(Behaviour country){
        return new CarLight(country);
    }

    public TrafficLight createCarLight(LightState state, Behaviour behaviour){
        return new CarLight(state, behaviour);
    }

    public CrossingInterface createPedestrianCrossing(TrafficLight carLight, TrafficLight pedestrian){
        return new PedestrianCrossing(carLight, pedestrian);
    }

    public CrossingInterface createFourWayCrossing(TrafficLight light1, TrafficLight light2, int timerSeconds){
        return new FourWayCrossing(light1, light2, timerSeconds);
    }

    public CrossingInterface createFourWayPedestrianCrossing(
            TrafficLight vCarlight, TrafficLight hCarlight, TrafficLight vPedlight, TrafficLight hPedlight, int timerSeconds){
        return new FourWayPedestrianCrossing(vCarlight, hCarlight, vPedlight, hPedlight, timerSeconds);
    }
}
