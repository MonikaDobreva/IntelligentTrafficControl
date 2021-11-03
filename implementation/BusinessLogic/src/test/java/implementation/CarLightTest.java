package implementation;

import api.TrafficLight;
import implementation.states.RedState;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarLightTest {

    TrafficLight cl = new CarLight();

    @Test
    void tInitState(){
        assertThat(cl).hasToString("Green");
    }

    @Test
    void tChangeFromGreen(){
        cl.changeState();
        assertThat(cl).hasToString("Yellow");
    }

    @Test
    void tChangeFromYellow(){
        cl.changeState();
        cl.changeState();
        assertThat(cl).hasToString("Red");
    }

    @Test
    void tChangeFromRed(){
        cl = new CarLight(new RedState(cl));
        cl.changeState();
        assertThat(cl).hasToString("RedYellow");
    }

    @Test
    void tChangeFromRedYellow(){
        cl = new CarLight(new RedState(cl));
        cl.changeState();
        cl.changeState();
        assertThat(cl).hasToString("Green");
    }

}