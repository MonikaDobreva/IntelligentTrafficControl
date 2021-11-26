package implementation.Entities;

import api.TrafficLight;
import implementation.states.States;

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

    public abstract void executeBehaviour(TrafficLight light) throws InterruptedException;
}
