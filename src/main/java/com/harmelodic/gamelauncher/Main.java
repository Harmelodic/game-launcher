package com.harmelodic.gamelauncher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Root.fxml"));
        VBox page = loader.load();
        Scene scene = new Scene(page);
        stage.setScene(scene);

        stage.setTitle("Game Launcher");
        stage.setWidth(1000);
        stage.setHeight(900);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
