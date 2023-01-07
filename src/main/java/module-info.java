module com.example.medicalapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires backend;

    opens com.example.medicalapp to javafx.fxml;
    exports com.example.medicalapp;
}