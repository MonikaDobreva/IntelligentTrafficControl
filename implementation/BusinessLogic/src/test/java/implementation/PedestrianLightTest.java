package implementation;

import api.TrafficLight;
import api.implementation.Entities.Behaviour;
import api.implementation.Entities.PedestrianLight;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PedestrianLightTest {

    TrafficLight tl = new PedestrianLight(Behaviour.GERMAN);

    @Test
    void tGreenState(){
        assertThat(tl).hasToString("Red");
    }

}
