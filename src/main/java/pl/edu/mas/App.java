package pl.edu.mas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Label helloLabel = new Label("Hello JavaFX + Java 21!");
        Scene scene = new Scene(helloLabel, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}