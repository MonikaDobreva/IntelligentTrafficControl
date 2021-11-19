package implementation.Entities;

import api.CrossingInterface;
import implementation.states.GreenState;
import implementation.states.RedState;

import java.time.LocalTime;
import java.time.ZoneId;

public class FourWayPedestrianCrossing implements CrossingInterface {

    CrossingInterface verticalPedestrianCrossing;
    CrossingInterface horizontalPedestrianCrossing;
    int secondsCycle;

    public FourWayPedestrianCrossing(CrossingInterface verticalCrossing, CrossingInterface horizontalCrossing, int secondsCycle) {
        this.verticalPedestrianCrossing = verticalCrossing;
        this.horizontalPedestrianCrossing = horizontalCrossing;
        this.secondsCycle = secondsCycle;
    }

    @Override
    public void cycle() throws InterruptedException {
//        verticalPedestrianCrossing.cycle();
//        horizontalPedestrianCrossing.cycle();
        /*
         * If ( carlights of the vertical crossing show red && the carLights of the horizontal crossing show green ||
         *  the carlights of the vertical corssing show green && the carlights of the horizontal crossing show red ) {
         *   start cycle in horizontal && vertical crossing
         * } else {
         *    throw exception "same lights from both crossings cannot be in the same state at the same time"
         * }
         * */
    }



    @Override
    public void start() throws InterruptedException {
        do {
            Thread.sleep(secondsCycle * 1000L);
            cycle();
        } while (!LocalTime.now(ZoneId.systemDefault()).equals(LocalTime.MIDNIGHT));
    }
}