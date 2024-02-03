module com.app.audiovisualizer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.app.audiovisualizer.ui to javafx.fxml;
    exports com.app.audiovisualizer.ui;
}