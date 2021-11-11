package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class SimplePedestrianCrossingController {


    @FXML
    private Button pedButton;
    @FXML
    private Circle pedRed, pedGreen, carRed, carGreen, carYellow;

    public void buttonPressed() throws InterruptedException {
        if(pedRed.getFill().equals(Color.RED)){
        pedRed.setFill(Color.WHITE);
        pedGreen.setFill(Color.GREEN);

        carGreen.setFill(Color.WHITE);
        carYellow.setFill(Color.YELLOW);

        Thread.sleep(1000);

        carYellow.setFill(Color.WHITE);
        carRed.setFill(Color.RED);
        } else {
            pedRed.setFill(Color.RED);
            pedGreen.setFill(Color.WHITE);
        }
    }
}
