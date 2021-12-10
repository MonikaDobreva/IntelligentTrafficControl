module com.example.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires BusinessLogic;
    requires javafx.graphics;
    requires java.logging;
    opens com.example.gui to javafx.fxml;
    exports com.example.gui;
}