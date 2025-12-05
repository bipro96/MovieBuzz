package com.example.moviebuzz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FirebaseInitializer.initialize();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("MovieBuzz Admin Portal");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}