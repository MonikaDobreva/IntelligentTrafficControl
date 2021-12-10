package implementation.Entities;

import api.TrafficLight;
import implementation.states.States;

/**
 * Special enums to satisfy the strategy design pattern. Defines strategies for a traffic light to cycle
 * through its states based on the behaviour of these in the respective country
 */
public enum Behaviour {
    GERMAN {

        @Override
        public void executeBehaviour(TrafficLight light) throws InterruptedException {

            if (light.getClass().equals(CarLight.class)) {

                if (light.getState().equals(States.RED)) {
                    light.changeStateTo(States.REDYELLOW);
                    Thread.sleep(2000);
                    light.changeStateTo(States.GREEN);
                } else if (light.getState().equals(States.GREEN)) {
                    light.changeStateTo(States.YELLOW);
                    Thread.sleep(4000);
                    light.changeStateTo(States.RED);
                }

            } else if (light.getClass().equals(PedestrianLight.class)) {



            }
        }
    },

    DUTCH {
        @Override
        public void executeBehaviour(TrafficLight light) throws InterruptedException {

            if (light.getClass().equals(CarLight.class)) {

                if (light.getState().equals(States.RED)) {
                    light.changeStateTo(States.GREEN);
                } else if (light.getState().equals(States.GREEN)) {
                    light.changeStateTo(States.YELLOW);
                    Thread.sleep(4000);
                    light.changeStateTo(States.RED);
                }

            } else if (light.getClass().equals(PedestrianLight.class)) {


            }

        }
    };

    /**
     * Parent method that needs to be overridden by the different behaviours in the different countries.
     * @param light The traffic light the behaviour is being applied on
     * @throws InterruptedException Use of threads forces to throw an InterruptedException
     */
    public abstract void executeBehaviour(TrafficLight light) throws InterruptedException;
}
