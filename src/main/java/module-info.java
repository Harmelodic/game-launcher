module gamelauncher {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.harmelodic.gamelauncher.ui to javafx.fxml;
    opens com.harmelodic.gamelauncher.ui.settings to javafx.fxml;

    exports com.harmelodic.gamelauncher;
}
