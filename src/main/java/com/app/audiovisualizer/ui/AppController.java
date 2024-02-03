package com.app.audiovisualizer.ui;

import com.app.audiovisualizer.application.AudioPlayer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        AudioPlayer testPlayer = new AudioPlayer();
        //welcomeText.setText("Welcome to JavaFX Application!");
    }
}