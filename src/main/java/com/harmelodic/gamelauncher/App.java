package com.harmelodic.gamelauncher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    // Currently only supporting en (English) as Locale
    public static final ResourceBundle STRINGS = ResourceBundle.getBundle("strings", Locale.of("en"));

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader rootLoader = new FXMLLoader(getClass().getResource("/Root.fxml"), STRINGS);
        stage.setScene(new Scene(rootLoader.load()));

        stage.setTitle(STRINGS.getString("app.name"));
        stage.setWidth(1280);
        stage.setHeight(960);
        stage.show();
    }
}
