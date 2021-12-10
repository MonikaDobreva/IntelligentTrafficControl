package implementation;

import api.TrafficLight;
import implementation.Entities.Behaviour;
import implementation.Entities.CarLight;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarLightTest {

    TrafficLight cl = new CarLight(Behaviour.GERMAN);

    @Test
    void tInitState(){
        assertThat(cl).hasToString("Green");
    }



}