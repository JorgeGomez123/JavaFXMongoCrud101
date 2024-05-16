module com.example.javafxmongocrud101 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxmongocrud101 to javafx.fxml;
    exports com.example.javafxmongocrud101;
}