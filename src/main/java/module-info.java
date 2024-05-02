module org.example.proyectot {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.proyectot to javafx.fxml;
    exports org.example.proyectot;
}