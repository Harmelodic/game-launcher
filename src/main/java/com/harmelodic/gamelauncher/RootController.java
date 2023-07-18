package com.harmelodic.gamelauncher;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class RootController {

    @FXML
    public Pane mainPane;

    @FXML
    private void initialize() {
        Label label = new Label();
        label.setText("Welcome to Game Launcher");
        mainPane.getChildren().setAll(label);
    }
}
