package com.example.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FourWayPedestrianCrossing {

    public void backHome() throws IOException {
        Stage stage = HelloApplication.getStage();
        FXMLLoader fxmlLoader = new FXMLLoader(HomeViewController.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
    }

}
