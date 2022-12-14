package com.example.gui;

//import api.TrafficLight;
//import implementation.Entities.CarLight;
//import implementation.Entities.PedestrianCrossing;
//import implementation.Entities.PedestrianLight;

import implementation.Entities.Behaviour;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;


public class SimplePedestrianCrossingController {


    // TrafficLight t1 = new PedestrianLight();
//     TrafficLight t2 = new CarLight();


//     public SimplePedestrianCrossingController(PedestrianCrossing pCrossing){
//         this.pCrossing = pCrossing;
//     }


    @FXML
    private Button pedButton;
    @FXML
    private Circle pedRed, pedGreen, carRed, carGreen, carYellow;
    @FXML
    public Label timerLabel;
    @FXML
    public ComboBox<Behaviour> simpleComboBox;

    public void setCircleFill(Circle circle, Color color) {
        circle.setFill(color);
    }

    public void buttonPressed() throws InterruptedException {
        timerLabel.setText("Button pressed");
        Thread.sleep(1000);
        carGreen.setFill(Color.WHITE);
        carYellow.setFill(Color.YELLOW);
        Thread.sleep(1000);
        carYellow.setFill(Color.WHITE);
        carRed.setFill(Color.RED);
    }

    public void backHome() throws IOException {
        Stage stage = HelloApplication.getStage();
        FXMLLoader fxmlLoader = new FXMLLoader(HomeViewController.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
    }

    public void fillBox() {
        simpleComboBox.setItems(FXCollections.observableArrayList(Arrays.asList(Behaviour.GERMAN, Behaviour.DUTCH, Behaviour.EMERGENCY)));
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
