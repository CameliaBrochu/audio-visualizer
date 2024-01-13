module com.app.audiovisualizer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.app.audiovisualizer to javafx.fxml;
    exports com.app.audiovisualizer;
}