package api.implementation.Observer;

public interface Subject {

    void registerObserver(UIObserver os);

    void removeObservers(UIObserver os);

    void notifyObservers(UIObserver... observers);

}
