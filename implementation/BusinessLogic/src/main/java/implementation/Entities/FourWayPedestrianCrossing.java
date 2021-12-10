package implementation.Entities;

import api.CrossingInterface;
import api.TrafficLight;
import implementation.states.States;

import java.time.LocalTime;
import java.time.ZoneId;

public class FourWayPedestrianCrossing implements CrossingInterface {

    TrafficLight vPl, hPl, vCl, hCl;
    int secondsCycle;

    public FourWayPedestrianCrossing(TrafficLight vCarlight, TrafficLight hCarlight, TrafficLight vPedlight, TrafficLight hPedlight, int secondsCycle) {
        this.vPl = vPedlight;
        this.hPl = hPedlight;
        this.vCl = vCarlight;
        this.hCl = hCarlight;
        this.secondsCycle = secondsCycle;
    }

    @Override
    public void cycle() throws InterruptedException {
        if(vCl.getState().equals(States.RED) && hCl.getState().equals(States.GREEN)){
            hPl.switching(); // pedestrian and car light both turn red in their
            hCl.switching(); // own cycle dependent on their specified behaviour
            vPl.switching();
            vCl.switching();
        } else if(vCl.getState().equals(States.GREEN) && hCl.getState().equals(States.RED)){
            vPl.switching();
            vCl.switching();
            hPl.switching();
            hCl.switching();
        }
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

    @Override
    public TrafficLight getCarlight() {
//        return verticalPedestrianCrossing.getCarlight();
//        return verticalPedestrianCrossing.getCarlight();
        return null;
    }
}