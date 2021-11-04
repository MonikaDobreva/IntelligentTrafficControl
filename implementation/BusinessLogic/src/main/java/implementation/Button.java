package implementation;

import api.Observable;
import api.TrafficLight;

import java.util.List;

public class Button implements Observable {
    private List<TrafficLight> lights;

    public void addLights(TrafficLight... lights){
        for (TrafficLight tl : lights) {
            this.lights.add(tl);
        }
    }

    @Override
    public void update() {
        for (TrafficLight light : lights) {
            light.update();
        }
    }
}
