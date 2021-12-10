package api.implementation.Entities;

import api.CrossingInterface;
import api.TrafficLight;
import api.implementation.states.States;

public class PedestrianCrossing implements CrossingInterface {
    private TrafficLight carLight;
    private TrafficLight pedestrianLight;

    public PedestrianCrossing(TrafficLight carLight, TrafficLight pedestrianLight){
        this.carLight = carLight;
        this.pedestrianLight = pedestrianLight;
    }

    @Override
    public void cycle() throws InterruptedException {
        if (carLight.getState().equals(States.GREEN) && pedestrianLight.getState().equals(States.RED)){
            carLight.switching();
            Thread.sleep(4000);
            pedestrianLight.switching();
        }else if (carLight.getState().equals(States.RED) && pedestrianLight.getState().equals(States.GREEN)){
            pedestrianLight.switching();
            Thread.sleep(5000);
            carLight.switching();
        }
    }

    @Override
    public void start() throws InterruptedException {
        while(true){
            cycle();
        }
    }

    @Override
    public TrafficLight getCarlight() {
        return carLight;
    }
}