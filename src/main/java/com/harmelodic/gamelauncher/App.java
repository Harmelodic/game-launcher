package com.harmelodic.gamelauncher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Root.fxml"));
        BorderPane page = loader.load();
        Scene scene = new Scene(page);
        stage.setScene(scene);
    }

    private void launchWindow(Stage stage) {
        stage.setTitle("Game Launcher");
        stage.setWidth(1280);
        stage.setHeight(960);
        stage.show();
    }
}
