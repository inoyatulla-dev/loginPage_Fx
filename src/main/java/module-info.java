module com.example.logonpage {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens com.example.logonpage to javafx.fxml;
    exports com.example.logonpage;
}