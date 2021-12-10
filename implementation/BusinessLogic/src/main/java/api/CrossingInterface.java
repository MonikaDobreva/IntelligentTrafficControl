package api;

public interface CrossingInterface{

    /**
     * Method to cycle throw the different states of a crossing
     * @throws InterruptedException
     */
    public void cycle() throws InterruptedException;

    /**
     * Method to initialize the traffic process
     * @throws InterruptedException
     */
    public void start() throws InterruptedException;

    /**
     * Helper method to retrieve the carlights from the crossing interface
     * @return The carlight as instance of a TrafficLight
     */
    public TrafficLight getCarlight();
}
