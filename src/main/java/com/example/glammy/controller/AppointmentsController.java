package com.example.glammy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import com.example.glammy.model.Appointment;
import com.example.glammy.model.DataHolder;

import java.io.IOException;

public class AppointmentsController {

    @FXML
    private TableView<Appointment> tableView;

    @FXML
    private TableColumn<Appointment, String> serviceColumn;

    @FXML
    private TableColumn<Appointment, String> dateColumn;

    @FXML
    private TableColumn<Appointment, String> timeColumn;

    @FXML
    private TableColumn<Appointment, String> nameColumn;

    @FXML
    public void initialize() {

        nameColumn.setCellValueFactory(
                new PropertyValueFactory<>("name")
        );

        serviceColumn.setCellValueFactory(
                new PropertyValueFactory<>("service")
        );

        dateColumn.setCellValueFactory(
                new PropertyValueFactory<>("date")
        );

        timeColumn.setCellValueFactory(
                new PropertyValueFactory<>("time")
        );

        tableView.setItems(DataHolder.appointments);
    }
    @FXML
    private void goToHome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/home.fxml"));

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
}