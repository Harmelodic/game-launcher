package com.harmelodic.gamelauncher.ui.settings;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

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
            try {
                stage.setScene(
                        new Scene(
                                new FXMLLoader(SettingsStage.class.getResource("/Settings.fxml"))
                                        .load()));
            } catch (IOException e) {
                // Do nothing - error popup?
            }
        }
    }

    public static void open() {
        createIfNotAlready();
        stage.show();
        Platform.runLater(() -> stage.requestFocus());
    }
}
