package com.example.gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeViewController {

    @FXML
    private Button pedXButton;

    public HomeViewController() {}

    void setScene(String view) throws IOException {
        Stage stage = HelloApplication.getStage();
        FXMLLoader fxmlLoader = new FXMLLoader(HomeViewController.class.getResource(view + ".fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
    }

    public void showSimplePedX() throws IOException {
        setScene("simple-pedestrian-crossing");
    }

    public void showFourWayX() throws IOException{
        setScene("four-way-crossing");
    }

    public void showFourWayPedX() throws IOException{
        setScene("four-way-pedestrian-crossing");
    }
}

//        Stage stage = HelloApplication.getStage();
//        FXMLLoader fxmlLoader = new FXMLLoader(HomeViewController.class.getResource("simple-pedestrian-crossing.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setScene(scene);
