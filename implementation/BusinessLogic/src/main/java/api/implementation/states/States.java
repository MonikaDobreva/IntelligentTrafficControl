package api.implementation.states;

import api.LightState;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;

/**
 * The different states a traffic light can be in. Each of them define the color of light currently shown by the
 * traffic light
 */
public enum States implements LightState {
    RED{
//        @Override
//        public void changeCircleFill(Circle c) {
//            c.setFill(Color.RED);
//        }
    },
    REDYELLOW {
//        @Override
//        public void changeCircleFill(Circle c) {
//            c.setFill(Color.ORANGE);
//        }
    },
    YELLOW {
//        @Override
//        public void changeCircleFill(Circle c) {
//            c.setFill(Color.YELLOW);
//        }
    },
    GREEN {
//        @Override
//        public void changeCircleFill(Circle c) {
//            c.setFill(Color.GREEN);
//        }
    };

//    public abstract void changeCircleFill(Circle c);
}
