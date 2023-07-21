package com.harmelodic.gamelauncher.ui;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
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
    public VBox statusBar;

    @FXML
    public void initialize() throws IOException {
        Platform.runLater(() -> pane.requestFocus());

        pane.setTop(new FXMLLoader(getClass().getResource("/Toolbar.fxml")).load());
    }
}
