package org.example.proyectot;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController {
    @FXML private Pane toolBar;

    private double x, y;

    public void init(Stage stage) {

        toolBar.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });

        toolBar.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getSceneX()-x);
            stage.setY(mouseEvent.getSceneY()-y);
        });
    }
}
