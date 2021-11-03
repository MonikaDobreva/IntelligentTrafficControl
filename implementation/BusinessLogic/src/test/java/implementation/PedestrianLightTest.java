package implementation;

import api.TrafficLight;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PedestrianLightTest {

    TrafficLight tl = new PedestrianLight();

    @Test
    void tGreenState(){
        assertThat(tl).hasToString("Red");
    }

    @Test
    void tChangeState(){
        tl.changeState();
        assertThat(tl).hasToString("Green");
    }

    @Test
    void tChangeFromGreen(){
        tl.changeState();
        tl.changeState();
        assertThat(tl).hasToString("Red");
    }

}
