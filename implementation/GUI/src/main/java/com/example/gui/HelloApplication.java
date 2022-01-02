package com.example.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        HelloApplication.stage = stage;
        stage.setTitle("Home View");
        stage.setScene(scene);
        stage.show();
    }

    static Stage getStage(){
        return stage;
    }

    public static void main(String[] args) {
        launch();
    }
}