package com.example.glammy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.example.glammy.model.Appointment;
import com.example.glammy.model.DataHolder;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class BookingController {

    @FXML
    private ComboBox<String> serviceBox;

    @FXML
    private DatePicker datePicker;

    @FXML
    private ComboBox<String> timeBox;

    @FXML
    private TextField nameField;

    @FXML
    public void initialize() {

        serviceBox.getItems().addAll(
                "Hair",
                "Lashes",
                "Facial",
                "Nails"
        );

        timeBox.getItems().addAll(
                "10:00 AM",
                "12:00 PM",
                "2:00 PM",
                "4:00 PM"
        );
    }

    @FXML
    private void goToHome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/home.fxml"));

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void confirmBooking(ActionEvent event) throws IOException {

        String service = serviceBox.getValue();

        String date = datePicker.getValue().toString();

        String time = timeBox.getValue();

        String name = nameField.getText();

        DataHolder.appointments.add(
                new Appointment(name, service, date, time)
        );

        Parent root = FXMLLoader.load(getClass().getResource("/appointments.fxml"));

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}