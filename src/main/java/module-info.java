module com.example.fx7calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx7calculator to javafx.fxml;
    exports com.example.fx7calculator;
}