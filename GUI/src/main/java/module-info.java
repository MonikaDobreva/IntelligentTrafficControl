module com.example.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires BusinessLogic;
    opens com.example.gui to javafx.fxml;
    exports com.example.gui;
}