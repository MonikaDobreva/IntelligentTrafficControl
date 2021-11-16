package implementation;

import api.CrossingInterface;
import api.TrafficLight;
import implementation.Entities.*;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        TrafficLight pl = new PedestrianLight();
        TrafficLight cl = new CarLight();
        TrafficLight cl2 = new CarLight();

        cl2.changeState();
        cl2.changeState();

        CrossingInterface crossing = new PedestrianCrossing(cl, pl);
        CrossingInterface crossing2 = new FourWayCrossing(cl, cl2, 5);

        Button b = new Button(crossing);
        Button b2 = new Button(crossing2);


//        b2.update();
        crossing2.start();
    }

}
