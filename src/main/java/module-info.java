module com.example.javadesignprojecet {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javadesignprojecet to javafx.fxml;
    exports com.example.javadesignprojecet;
}