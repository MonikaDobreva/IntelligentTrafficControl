package implementation;

import api.LightState;
import api.TrafficLight;
import implementation.states.RedState;

import java.util.EventListener;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import static java.lang.Object.*;

public class PedestrianLight implements TrafficLight {

    LightState currentState;

    public PedestrianLight() {
        currentState = new RedState(this);
    }

    @Override
    public void changeState() {
        currentState = currentState.changeState();
    }

    @Override
    public void update() {
        if (currentState.getClass().equals(RedState.class)){
            try {
                cycle();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void cycle() throws InterruptedException{
        Timer t = new Timer();
        System.out.println(currentState);
        Thread.sleep(20000);
        changeState();
        System.out.println(currentState);
        Thread.sleep(10000);
        changeState();
        System.out.println(currentState);
    }

    @Override
    public LightState getState() {
        return currentState;
    }

    @Override
    public String toString() {
        return currentState.toString();
    }
}
