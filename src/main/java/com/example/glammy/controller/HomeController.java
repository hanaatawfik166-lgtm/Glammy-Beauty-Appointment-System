package com.example.glammy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    @FXML
    private void goToService(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/service.fxml"));

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void goToBooking(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/booking.fxml"));

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void goToTips(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/BeautyTips.fxml"));

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void goToAppointments(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/appointments.fxml"));

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void goToLogin(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}