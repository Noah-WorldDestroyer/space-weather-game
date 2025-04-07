package com.example;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    private Button beginButton;

    @FXML
    private Button settingsButton;

    @FXML
    void switchToGame(MouseEvent event) throws IOException {
        App.setRoot("07042025-SpaceWeatherGameGUI");
    }

    @FXML
    private void switchToSettings(MouseEvent event) throws IOException {
        App.setRoot("03042025-SpaceWeatherSettingsGUI");
    }
}

