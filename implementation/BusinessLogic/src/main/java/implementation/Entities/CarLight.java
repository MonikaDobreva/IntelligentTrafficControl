package implementation.Entities;

import api.LightState;
import api.TrafficLight;
import implementation.states.GreenState;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class CarLight implements TrafficLight {

    private LightState currentState;
    private TrafficLight pedestrianLight;

    public CarLight() {
        currentState = new GreenState(this);
    }

    public CarLight(TrafficLight pedestrian){
        currentState = new GreenState(this);
        this.pedestrianLight = pedestrian;
    }

    public CarLight(TrafficLight pedestrian, LightState state){
        currentState = state;
        this.pedestrianLight = pedestrian;
    }

    public CarLight(LightState state) {
        currentState = state;
    }

    @Override
    public void changeState() {
        currentState = currentState.changeState();
    }

    @Override
    public void update() {
        if (currentState.getClass().equals(GreenState.class)){
            try {
                cycle();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void cycle() throws InterruptedException{
        if (pedestrianLight == null){
            System.out.println(currentState);
            //TimeUnit.SECONDS.wait(8);
            Thread.sleep(6000);
            changeState();
            System.out.println(currentState);
            //t.wait(2000);
            //TimeUnit.SECONDS.wait(2);
            Thread.sleep(4000);
            changeState();
            System.out.println(currentState);
            //t.wait(18000);
            //TimeUnit.SECONDS.wait(18);
            Thread.sleep(18000);
            changeState();
            System.out.println(currentState);
            //t.wait(2000);
            //TimeUnit.SECONDS.wait(2);
            Thread.sleep(2000);
            changeState();
            System.out.println(currentState);
        }else{
            System.out.println("Car: " + currentState);
            System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
            Thread.sleep(6000);
            changeState();
            System.out.println("Car: " + currentState);
            System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
            Thread.sleep(4000);
            changeState();
            System.out.println("Car: " + currentState);
            System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
            Thread.sleep(10000);
            pedestrianLight.changeState();
            System.out.println("Car: " + currentState);
            System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
            Thread.sleep(10000);
            pedestrianLight.changeState();
            System.out.println("Car: " + currentState);
            System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
            Thread.sleep(8000);
            changeState();
            System.out.println("Car: " + currentState);
            System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
            Thread.sleep(2000);
            changeState();
            System.out.println("Car: " + currentState);
            System.out.println("Pedestrian: " + pedestrianLight.getState() + "\n");
        }
    }

    @Override
    public LightState getState() {
        return getState();
    }

    @Override
    public String toString() {
        return currentState.toString();
    }
}
