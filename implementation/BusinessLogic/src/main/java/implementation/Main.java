package implementation;

import api.AbstractFactory;
import api.CrossingInterface;
import api.TrafficLight;
import implementation.Entities.Behaviour;
import implementation.Entities.Button;
import implementation.Factory;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        AbstractFactory fac = Factory.getFactory();
        System.out.println("Please enter the behavior");
        System.out.println("Possible behaviors: (DUTCH/GERMAN/EMERGENCY)");
        Scanner in = new Scanner(System.in);

        Behaviour inputtedBehavior = Behaviour.valueOf(in.next());

        System.out.println("You entered " + inputtedBehavior);

//        TrafficLight pl = Factory.getFactory().createPedestrianLight(inputtedBehavior);
        TrafficLight cl = fac.createCarLight(inputtedBehavior);
        TrafficLight cl2 = fac.createCarLight(inputtedBehavior);

        cl2.switching();

//        CrossingInterface crossing = Factory.getFactory().createPedestrianCrossing(cl, pl);
        CrossingInterface crossing2 = Factory.getFactory().createFourWayCrossing(cl, cl2, 5);
//        CrossingInterface pedCrossing = Factory.getFactory().createFourWayCrossing(cl, pl, 5);

//        Button b = new Button(crossing);
//        Button b2 = new Button(crossing2);


//        b2.update();
        crossing2.start();
    }

}
