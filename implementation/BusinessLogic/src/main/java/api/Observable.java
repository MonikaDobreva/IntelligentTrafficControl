package api;

/**
 * Interface to satisfy the observer design pattern
 */
public interface Observable {

    /**
     * Updates all the clients subscribed to the observable about its new state
     * @throws InterruptedException
     */
    void update() throws InterruptedException;
}
