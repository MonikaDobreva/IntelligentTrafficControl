package api;

import implementation.Entities.Behaviour;

/**
 * @author Benjamin Swiezy {@code b.swiezy@student.fontys.nl}
 */

public interface AbstractFactory {

    TrafficLight createPedestrianLight(Behaviour country);

    TrafficLight createPedestrianLight(LightState state, Behaviour country);

    TrafficLight createCarLight(Behaviour country);

    TrafficLight createCarLight(LightState state, Behaviour behaviour);

    CrossingInterface createPedestrianCrossing(TrafficLight carLight, TrafficLight pedestrian);

    CrossingInterface createFourWayCrossing(TrafficLight light1, TrafficLight light2, int timerSeconds);

    CrossingInterface createFourWayPedestrianCrossing(
            TrafficLight vCarlight, TrafficLight hCarlight, TrafficLight vPedlight, TrafficLight hPedlight, int timerSeconds);

}
