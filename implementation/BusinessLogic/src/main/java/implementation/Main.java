package implementation;

import api.CrossingInterface;
import api.TrafficLight;
import implementation.Entities.*;

import javax.xml.stream.FactoryConfigurationError;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        TrafficLight pl = Factory.getFactory().createPedestrianLight();
        TrafficLight cl = Factory.getFactory().createCarLight();
        TrafficLight cl2 = Factory.getFactory().createCarLight();

        cl2.changeState();
        cl2.changeState();

        CrossingInterface crossing = Factory.getFactory().createPedestrianCrossing(cl, pl);
        CrossingInterface crossing2 = Factory.getFactory().createFourWayCrossing(cl, cl2, 5);

        Button b = new Button(crossing);
        Button b2 = new Button(crossing2);


//        b2.update();
        crossing2.start();
    }

}
