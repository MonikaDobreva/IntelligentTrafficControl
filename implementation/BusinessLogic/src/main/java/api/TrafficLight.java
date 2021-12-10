package api;

import java.util.EventListener;

/**
 * Interface for the traffic lights to implement
 * Provides the methods access and change the different states on light can have
 */
public interface TrafficLight extends EventListener {

//    void changeState();

    /**
     * Changes the traffic light to a specified state
     * @param newState The state being changed to
     */
    void changeStateTo(LightState newState);

    /**
     * Returns the current state of the traffic light
     * @return The state enum being returned
     */
    LightState getState();

    /**
     * Helper method to ensure that a traffic light switches to the opposite state
     * while running through the respective steps
     * @throws InterruptedException Using the Thread Class
     */
    void switching() throws InterruptedException;
}
