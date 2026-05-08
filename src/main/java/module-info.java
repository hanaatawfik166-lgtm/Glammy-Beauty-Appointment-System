module com.example.glammy {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.glammy to javafx.fxml;
    opens com.example.glammy.controller to javafx.fxml;

    exports com.example.glammy;
}