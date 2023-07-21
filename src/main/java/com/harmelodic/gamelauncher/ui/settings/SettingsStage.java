package com.harmelodic.gamelauncher.ui.settings;

import javafx.application.Platform;
import javafx.stage.Stage;

public class SettingsStage {

    private SettingsStage() {
    }

    private static Stage stage;

    public static void createIfNotAlready() {
        if (stage == null) {
            stage = new Stage();
            stage.setTitle("Settings");
            stage.setWidth(600);
            stage.setHeight(400);
        }
    }

    public static void open() {
        createIfNotAlready();
        stage.show();
        Platform.runLater(() -> stage.requestFocus());
    }
}
