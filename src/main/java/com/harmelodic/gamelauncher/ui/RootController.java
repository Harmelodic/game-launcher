package com.harmelodic.gamelauncher.ui;

import com.harmelodic.gamelauncher.App;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class RootController {
    @FXML
    public BorderPane pane;

    @FXML
    public VBox gameList;

    @FXML
    public VBox filters;

    @FXML
    public HBox statusBar;

    @FXML
    public void initialize() throws IOException {
        Platform.runLater(() -> pane.requestFocus());

        FXMLLoader toolbarLoader = new FXMLLoader(getClass().getResource("/Toolbar.fxml"), App.STRINGS);
        pane.setTop(toolbarLoader.load());
    }
}
