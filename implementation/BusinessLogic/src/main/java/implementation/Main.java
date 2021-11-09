package implementation;

import api.TrafficLight;

import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        TrafficLight pl = new PedestrianLight();
        TrafficLight cl = new CarLight(pl);

        Button b = new Button();
        b.addLights(cl);

        while(true){
            Random rn = new Random();

            if (rn.nextBoolean()){
                System.out.println("Button pressed");
                b.update();
            }
        }
    }

}
