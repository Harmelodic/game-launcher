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
    public VBox filters; // Unused

    @FXML
    public HBox statusBar; // Unused

    @FXML
    public void initialize() throws IOException {
        Platform.runLater(() -> pane.requestFocus());

        FXMLLoader toolbarLoader = new FXMLLoader(getClass().getResource("/Toolbar.fxml"), App.STRINGS);
        pane.setTop(toolbarLoader.load());

        FXMLLoader libraryLoader = new FXMLLoader(getClass().getResource("/Library.fxml"), App.STRINGS);
        pane.setLeft(libraryLoader.load());

        FXMLLoader detailsLoader = new FXMLLoader(getClass().getResource("/Details.fxml"), App.STRINGS);
        pane.setCenter(detailsLoader.load());
    }
}
