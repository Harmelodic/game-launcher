package com.harmelodic.gamelauncher.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class ToolbarController {
    @FXML
    public ToolBar toolbar;

    @FXML
    public Pane toolbarSpacer;

    @FXML
    public Button settings;

    @FXML
    private void initialize() {
        HBox.setHgrow(toolbarSpacer, Priority.ALWAYS);

        settings.setOnMouseClicked(mouseEvent -> {
            Stage settingsWindow = new Stage();
            settingsWindow.setTitle("Settings");
            settingsWindow.setWidth(600);
            settingsWindow.setHeight(400);
            settingsWindow.show();
        });
    }
}
