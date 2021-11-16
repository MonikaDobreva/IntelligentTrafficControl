package implementation.Entities;

import api.LightState;
import api.TrafficLight;
import implementation.states.GreenState;
import implementation.states.RedState;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class CarLight implements TrafficLight {

    private LightState currentState;

    public CarLight() {
        currentState = new GreenState(this);
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
        if (currentState.getClass().equals(GreenState.class)) {
            try {
                cycle();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void cycle() throws InterruptedException {
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
    }

    @Override
    public LightState getState() {
        return currentState;
    }

    @Override
    public void switching() throws InterruptedException {
        if (getState().equals(new RedState(this))) {
            //Red
            System.out.println(getState());
            changeState();
            System.out.println(getState());
            Thread.sleep(3000);
            //RedYellow
            changeState();
            System.out.println(getState());
            //Green
        } else if (getState().equals(new GreenState(this))) {
            //Green
            System.out.println(getState());
            changeState();
            System.out.println(getState());
            Thread.sleep(5000);
            //Yellow
            changeState();
            System.out.println(getState());
            //Red
        }
    }

    @Override
    public String toString() {
        return currentState.toString();
    }
}
