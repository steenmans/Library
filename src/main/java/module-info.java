module com.samsteenmans {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;
    requires com.jfoenix;
    requires java.sql;
    opens com.samsteenmans to javafx.fxml;
    exports com.samsteenmans;
}