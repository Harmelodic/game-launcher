package com.harmelodic.gamelauncher;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class RootController {
    @FXML
    public BorderPane pane;

    @FXML
    public ToolBar toolbar;

    @FXML
    public VBox gameList;

    @FXML
    public VBox filters;

    @FXML
    public VBox statusBar;

    @FXML
    private void initialize() {
        toolbar.getItems().addAll(
                new TextField("Search for a game..."),
                new Button("Search")
        );
        Platform.runLater(() -> pane.requestFocus());
    }
}
