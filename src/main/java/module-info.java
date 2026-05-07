module com.example.glammy {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.glammy to javafx.fxml;
    exports com.example.glammy;
}