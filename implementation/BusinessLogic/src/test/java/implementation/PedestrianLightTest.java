package implementation;

import api.TrafficLight;
import implementation.Entities.Behaviour;
import implementation.Entities.PedestrianLight;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PedestrianLightTest {

    TrafficLight tl = new PedestrianLight(Behaviour.GERMAN);

    @Test
    void tGreenState(){
        assertThat(tl).hasToString("Red");
    }



}
