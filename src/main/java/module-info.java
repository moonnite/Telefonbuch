module com.example.telefonbuch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.telefonbuch to javafx.fxml;
    exports com.example.telefonbuch;
}