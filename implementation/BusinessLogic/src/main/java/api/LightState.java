package api;


public abstract class LightState {

    protected TrafficLight trafficLight;

    public LightState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    public abstract LightState changeState();

}
