package implementation.Entities;

import api.CrossingInterface;
import api.TrafficLight;
import implementation.states.States;

public class CrossingWithArrows implements CrossingInterface {
    private TrafficLight horizontalStraight;
    private TrafficLight horizontalLeftArrow;
    private TrafficLight horizontalRightArrow;
    private TrafficLight verticalStraight;
    private TrafficLight verticalLeftArrow;
    private TrafficLight verticalRightArrow;
    private int timerSeconds;

    public CrossingWithArrows(TrafficLight horizontalStraight, TrafficLight horizontalLeftArrow, TrafficLight horizontalRightArrow, TrafficLight verticalStraight, TrafficLight verticalLeftArrow, TrafficLight verticalRightArrow, int timerSeconds) {
        this.horizontalStraight = horizontalStraight;
        this.horizontalLeftArrow = horizontalLeftArrow;
        this.horizontalRightArrow = horizontalRightArrow;
        this.verticalStraight = verticalStraight;
        this.verticalLeftArrow = verticalLeftArrow;
        this.verticalRightArrow = verticalRightArrow;
        this.timerSeconds = timerSeconds;
    }

    @Override
    public void cycle() throws InterruptedException {
        Thread.sleep(timerSeconds * 1000);

        verticalStraight.switching();
        verticalRightArrow.switching();

        verticalLeftArrow.switching();

        Thread.sleep(timerSeconds * 1000);

        verticalLeftArrow.switching();

        horizontalStraight.switching();
        horizontalRightArrow.switching();

        Thread.sleep(timerSeconds * 1000);

        horizontalStraight.switching();
        horizontalRightArrow.switching();

        horizontalLeftArrow.switching();

        Thread.sleep(timerSeconds * 1000);

        horizontalLeftArrow.switching();

        verticalStraight.switching();
        verticalRightArrow.switching();
    }

    @Override
    public void start() throws InterruptedException {
        while(true){
            cycle();
        }
    }

    @Override
    public TrafficLight getCarlight() {
        return null;
    }
}
