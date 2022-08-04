module com.example.obsrlists {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.obsrlists to javafx.fxml;
    exports com.example.obsrlists;
}