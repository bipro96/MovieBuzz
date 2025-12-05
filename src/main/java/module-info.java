module com.example.moviebuzz {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires firebase.admin;
    requires com.google.auth.oauth2;
    requires com.google.auth;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.moviebuzz to javafx.fxml;
    exports com.example.moviebuzz;
}