module com.example.glammy {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.glammy to javafx.fxml;
    opens com.example.glammy.controller to javafx.fxml;

    opens com.example.glammy.model to javafx.base;

    exports com.example.glammy;
    exports com.example.glammy.controller;
    exports com.example.glammy.model;
}