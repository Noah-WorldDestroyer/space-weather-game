package com.example;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class GameController {

    @FXML
    private ImageView alienCharacterImageView;

    @FXML
    private Rectangle greyBackgroundRectangle;




    @FXML
    void initialize(){
        greyBackgroundRectangle.setOpacity(0.5);
    }
}