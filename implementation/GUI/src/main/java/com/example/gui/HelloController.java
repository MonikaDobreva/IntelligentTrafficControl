package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void buttonPressed() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onHelloButtonClick(ActionEvent actionEvent) {
    }
}