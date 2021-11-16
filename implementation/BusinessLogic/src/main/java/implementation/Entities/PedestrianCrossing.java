package implementation.Entities;

import api.CrossingInterface;
import api.TrafficLight;
import implementation.states.GreenState;
import implementation.states.RedState;

public class PedestrianCrossing implements CrossingInterface {
    private TrafficLight carLight;
    private TrafficLight pedestrianLight;

    public PedestrianCrossing(TrafficLight carLight, TrafficLight pedestrianLight){
        this.carLight = carLight;
        this.pedestrianLight = pedestrianLight;
    }

    @Override
    public void cycle() throws InterruptedException {
//        System.out.println("Car: " + carLight.getState());
//        System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
//        Thread.sleep(6000);
//        carLight.changeState();
//        System.out.println("Car: " + carLight.getState());
//        System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
//        Thread.sleep(4000);
//        carLight.changeState();
//        System.out.println("Car: " + carLight.getState());
//        System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
//        Thread.sleep(10000);
//        pedestrianLight.changeState();
//        System.out.println("Car: " + carLight.getState());
//        System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
//        Thread.sleep(10000);
//        pedestrianLight.changeState();
//        System.out.println("Car: " + carLight.getState());
//        System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
//        Thread.sleep(8000);
//        carLight.changeState();
//        System.out.println("Car: " + carLight.getState());
//        System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
//        Thread.sleep(2000);
//        carLight.changeState();
//        System.out.println("Car: " + carLight.getState());
//        System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
        if (carLight.getState().equals(new GreenState(carLight)) && pedestrianLight.getState().equals(new RedState(pedestrianLight))){
            carLight.switching();
            Thread.sleep(4000);
            pedestrianLight.switching();
        }else if (carLight.getState().equals(new RedState(carLight)) && pedestrianLight.getState().equals(new GreenState(pedestrianLight))){
            pedestrianLight.switching();
            Thread.sleep(5000);
            carLight.switching();
        }
    }

    @Override
    public void start() throws InterruptedException {

    }
}
