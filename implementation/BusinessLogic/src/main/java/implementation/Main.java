package implementation;

import api.CrossingInterface;
import api.TrafficLight;
import implementation.Entities.*;

import javax.xml.stream.FactoryConfigurationError;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        TrafficLight pl = Factory.getFactory().createPedestrianLight(Behaviour.GERMAN);
        TrafficLight cl = Factory.getFactory().createCarLight(Behaviour.GERMAN);
        TrafficLight cl2 = Factory.getFactory().createCarLight(Behaviour.GERMAN);

        pl.switching();

        CrossingInterface crossing = Factory.getFactory().createPedestrianCrossing(cl, pl);
        CrossingInterface crossing2 = Factory.getFactory().createFourWayCrossing(cl, cl2, 5);
        CrossingInterface pedCrossing = Factory.getFactory().createFourWayCrossing(cl, pl, 5);

        Button b = new Button(crossing);
        Button b2 = new Button(crossing2);


//        b2.update();
        crossing.start();
    }

}
