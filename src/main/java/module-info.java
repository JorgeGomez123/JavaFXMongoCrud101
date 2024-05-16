module com.example.javafxmongocrud101 {
    requires javafx.controls;
    requires javafx.fxml;
    requires mongo.java.driver;

    opens com.example.javafxmongocrud101 to javafx.fxml;
    exports com.example.javafxmongocrud101;
}