package api;

import java.util.EventListener;

public interface TrafficLight extends EventListener {

    void changeState();

}
