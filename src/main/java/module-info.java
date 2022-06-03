module com.example.assigment5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assigment5 to javafx.fxml;
    exports com.example.assigment5;
}