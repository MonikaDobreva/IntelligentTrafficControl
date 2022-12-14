package implementation.Entities;

import api.CrossingInterface;
import api.TrafficLight;
import implementation.states.States;

import java.time.LocalTime;
import java.time.ZoneId;

public class FourWayCrossing implements CrossingInterface {
    private TrafficLight horizontal;
    private TrafficLight vertical;
    private int secondsCycle;

    public FourWayCrossing(TrafficLight horizontal, TrafficLight vertical, int secondsCycle) {
        if (!(horizontal.getClass().equals(CarLight.class) ||vertical.getClass().equals(CarLight.class))){
            throw new IllegalArgumentException("Must be 2 car lights");
        }
        if (horizontal.getState().equals(vertical.getState())) {
            throw new IllegalArgumentException("Lights cannot be in the same state");
        }
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.secondsCycle = secondsCycle;
    }

    @Override
    public void cycle() throws InterruptedException {
        if (horizontal.getState().equals(States.GREEN) && vertical.getState().equals(States.RED)) {
            System.out.println("Switching first");
            horizontal.switching();
            Thread.sleep(3000);
            System.out.println("switching second");
            vertical.switching();
        } else if (horizontal.getState().equals(States.RED) && vertical.getState().equals(States.GREEN)) {
            System.out.println("Switching first");
            vertical.switching();
            Thread.sleep(3000);
            System.out.println("switching second");
            horizontal.switching();
        }
    }

    @Override
    public void start() throws InterruptedException {
        while (true) {
            Thread.sleep(secondsCycle * 1000);
            cycle();
            if (LocalTime.now(ZoneId.systemDefault()).equals(LocalTime.MIDNIGHT)) {
                break;
            }
        }
        nightCycle();
    }

    @Override
    public TrafficLight getCarlight() {
        return null;
    }

    public void nightCycle() throws InterruptedException {
        System.out.println("nightcycle");
        while(true){
            if (LocalTime.now(ZoneId.systemDefault()).equals(LocalTime.of(5,0))) {
                break;
            }
        }
        start();
    }
}
