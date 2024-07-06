module com.example.scenebuider1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.scenebuider1 to javafx.fxml;
    exports com.example.scenebuider1;
}