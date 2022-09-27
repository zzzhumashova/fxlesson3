module com.example.registrationpage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.registrationpage to javafx.fxml;
    exports com.example.registrationpage;
}