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

public class RegisterController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private void goToHome(ActionEvent event) throws IOException {

        // EMPTY FIELDS VALIDATION
        if(nameField.getText().isEmpty() ||
                emailField.getText().isEmpty() ||
                passwordField.getText().isEmpty() ||
                confirmPasswordField.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all fields!");

            alert.showAndWait();
            return;
        }

        // PASSWORD MATCH VALIDATION
        if(!passwordField.getText().equals(confirmPasswordField.getText())) {

            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Passwords do not match!");

            alert.showAndWait();
            return;
        }

        Parent root = FXMLLoader.load(getClass().getResource("/home.fxml"));

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void goToLogin(ActionEvent event) throws IOException {

        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("/login.fxml"));

        Parent root = loader.load();

        Stage stage =
                (Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();

        stage.setScene(new Scene(root));

        stage.centerOnScreen();

        stage.show();
    }
}