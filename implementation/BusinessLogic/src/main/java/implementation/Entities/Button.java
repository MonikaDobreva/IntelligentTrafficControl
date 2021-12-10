package implementation.Entities;

import api.CrossingInterface;
import api.Observable;

public class Button implements Observable {
    private CrossingInterface crossing;

    public Button(CrossingInterface crossing) {
        this.crossing = crossing;
    }

//    public void addLights(TrafficLight... lightsToAdd) {
//        lights.addAll(List.of(lightsToAdd));
//    }

    @Override
    public void update() throws InterruptedException {
        crossing.cycle();
    }
}
