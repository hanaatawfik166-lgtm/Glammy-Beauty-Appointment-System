package com.example.glammy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {

        String email = emailField.getText();

        String password = passwordField.getText();

        // EMPTY VALIDATION
        if(email.isEmpty() || password.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter email and password!");

            alert.showAndWait();

            return;
        }

        // LOGIN SUCCESS
        Parent root =
                FXMLLoader.load(getClass().getResource("/home.fxml"));

        Stage stage =
                (Stage)((Node)event.getSource())
                        .getScene()
                        .getWindow();

        stage.setScene(new Scene(root));

        stage.show();
    }

    @FXML
    private void goToRegister(ActionEvent event) throws IOException {

        Parent root =
                FXMLLoader.load(getClass().getResource("/register.fxml"));

        Stage stage =
                (Stage)((Node)event.getSource())
                        .getScene()
                        .getWindow();

        stage.setScene(new Scene(root));

        stage.show();
    }
}