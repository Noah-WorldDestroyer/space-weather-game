package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class SettingsController {

    @FXML
    private Button menuReturnButton;

    @FXML
    void switchToMenu(MouseEvent event) throws IOException {
        App.setRoot("01042025-SpaceWeatherMenuGUI");
    }

}
