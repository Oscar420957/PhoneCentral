module com.phonecentral {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.phonecentral to javafx.fxml;

    exports com.phonecentral;
}