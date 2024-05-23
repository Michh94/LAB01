module org.example.lab101 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab101 to javafx.fxml;
    exports org.example.lab101;
}