package com.example.moviebuzz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label errorMessageLabel;

    @FXML
    public void handleLogin(ActionEvent event) throws IOException {
        String user = usernameField.getText();
        String pass = passwordField.getText();

        if (user.equals("bb") && pass.equals("bb96")) {
            switchScene(event, "admin-dashboard.fxml");
        } else {
            errorMessageLabel.setText("Invalid Admin Credentials");
            errorMessageLabel.setVisible(true);
        }
    }
    private void switchScene(ActionEvent event, String fxmlName) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/moviebuzz/" + fxmlName));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}