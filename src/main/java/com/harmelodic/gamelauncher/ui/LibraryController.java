package com.harmelodic.gamelauncher.ui;

import com.harmelodic.gamelauncher.App;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class LibraryController {

    @FXML
    public VBox gameList;

    @FXML
    public void initialize() {
        Label placeholder = new Label(App.STRINGS.getString("library.placeholder"));
        placeholder.setTextFill(Color.WHITE);
        gameList.getChildren().add(placeholder);
    }
}
