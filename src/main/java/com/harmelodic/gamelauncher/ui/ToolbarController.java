package com.harmelodic.gamelauncher.ui;

import com.harmelodic.gamelauncher.ui.settings.SettingsStage;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

import java.util.Set;

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

        settings.setOnMouseClicked(mouseEvent -> SettingsStage.open());
    }
}
