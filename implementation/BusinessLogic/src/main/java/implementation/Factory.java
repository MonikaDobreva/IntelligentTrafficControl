package implementation;

import api.CrossingInterface;
import implementation.Entities.*;
import api.TrafficLight;

public class Factory {

    public Factory(){
    }

    static Factory getFactory(){
        return new Factory();
    }

    public TrafficLight createPedestrianLight(){
        return new PedestrianLight();
    }

    public TrafficLight createCarLight(){
        return new CarLight();
    }

    public CrossingInterface createPedestrianCrossing(TrafficLight carLight, TrafficLight pedestrian){
        return new PedestrianCrossing(carLight, pedestrian);
    }

    public CrossingInterface createFourWayCrossing(TrafficLight light1, TrafficLight light2, int timerSeconds){
        return new FourWayCrossing(light1, light2, timerSeconds);
    }

    public CrossingInterface createFourWayPedestrianCrossing(CrossingInterface verticalPed, CrossingInterface horizontalPed, int timerSeconds){
        return new FourWayPedestrianCrossing(verticalPed, horizontalPed, timerSeconds);
    }
}
