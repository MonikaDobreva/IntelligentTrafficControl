package com.example.gui;

import api.TrafficLight;
import implementation.Entities.CarLight;
import implementation.Entities.PedestrianCrossing;
import implementation.Entities.PedestrianLight;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.Timer;
import java.util.TimerTask;


public class SimplePedestrianCrossingController {

    // TrafficLight t1 = new PedestrianLight();
//     TrafficLight t2 = new CarLight();
     PedestrianCrossing pCrossing;

//     public SimplePedestrianCrossingController(PedestrianCrossing pCrossing){
//         this.pCrossing = pCrossing;
//     }


    Timer timer = new Timer();

    @FXML
    private Button pedButton;
    @FXML
    private Circle pedRed, pedGreen, carRed, carGreen, carYellow;
    @FXML
    public Label timerLabel;

    public void buttonPressed() throws InterruptedException {

    }

//    public void buttonPressed() throws InterruptedException {
//        pCrossing.getPedestrianLight().update();
//        pCrossing.cycle();
//        if(pedRed.getFill().equals(Color.RED)){
//        pedRed.setFill(Color.WHITE);
//        pedGreen.setFill(Color.GREEN);
//
//        carGreen.setFill(Color.WHITE);
//        carYellow.setFill(Color.YELLOW);
//
//        Thread.sleep(1000);
//
//        carYellow.setFill(Color.WHITE);
//        carRed.setFill(Color.RED);
//        } else {
//            pedRed.setFill(Color.RED);
//            pedGreen.setFill(Color.WHITE);
//        }
//    }
}