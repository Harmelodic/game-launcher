package com.harmelodic.gamelauncher.ui.settings;

import com.harmelodic.gamelauncher.App;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingsStage {

    private SettingsStage() {
    }

    private static Stage stage;

    public static void createIfNotAlready() {
        if (stage == null) {
            stage = new Stage();
            stage.setTitle(App.STRINGS.getString("settings.title"));
            stage.setWidth(600);
            stage.setHeight(400);

            FXMLLoader settingsLoader = new FXMLLoader(SettingsStage.class.getResource("/Settings.fxml"), App.STRINGS);
            try {
                stage.setScene(new Scene(settingsLoader.load()));
            } catch (IOException e) {
                VBox vBox = new VBox();
                vBox.setAlignment(Pos.CENTER);
                vBox.getChildren().add(new Label(App.STRINGS.getString("settings.error")));
                stage.setScene(new Scene(vBox));
            }
        }
    }

    public static void open() {
        createIfNotAlready();
        stage.show();
        Platform.runLater(() -> stage.requestFocus());
    }
}
