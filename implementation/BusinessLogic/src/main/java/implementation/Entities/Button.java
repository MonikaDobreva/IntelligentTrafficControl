package implementation.Entities;

import api.Observable;
import api.TrafficLight;

import java.util.ArrayList;
import java.util.List;

public class Button implements Observable {
    private List<TrafficLight> lights;

    public Button(){
        this.lights = new ArrayList<>();
    }

    public Button(TrafficLight... lights){
        this.lights = new ArrayList<>();
        this.lights.addAll(List.of(lights));
    }

    public void addLights(TrafficLight... lightsToAdd){
        lights.addAll(List.of(lightsToAdd));
    }

    @Override
    public void update() {
        for (TrafficLight light : lights) {
            light.update();
        }
    }
}
