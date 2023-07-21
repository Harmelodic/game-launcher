package com.harmelodic.gamelauncher.ui;

import com.harmelodic.gamelauncher.ui.settings.SettingsStage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;

public class ToolbarController {
    @FXML
    public ToolBar toolbar;

    @FXML
    public Pane toolbarSpacer;

    @FXML
    public Button settings;

    @FXML
    public void initialize() {
        HBox.setHgrow(toolbarSpacer, Priority.ALWAYS);

        settings.setOnMouseClicked(mouseEvent -> SettingsStage.open());
    }
}
