package com.harmelodic.gamelauncher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        loadUI(stage);
        launchWindow(stage);
    }

    private void loadUI(Stage stage) throws IOException {
        stage.setScene(
                new Scene(
                        new FXMLLoader(getClass().getResource("/Root.fxml"))
                                .load()));
    }

    private void launchWindow(Stage stage) {
        stage.setTitle("Game Launcher");
        stage.setWidth(1280);
        stage.setHeight(960);
        stage.show();
    }
}
