module com.example.demo {
    requires java.sql;
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.demo.application;

    opens com.example.demo.application.controllers.dashboard to javafx.fxml;
    opens com.example.demo.application.controllers.dashboard.tools to javafx.fxml;
    opens com.example.demo.application.controllers.dashboard.tools.check to javafx.fxml;
    opens com.example.demo.application.controllers.login to javafx.fxml;

    exports com.example.demo.models;
    exports com.example.demo.dao;
    exports com.example.demo.db;
    exports com.example.demo.exceptions;
    exports com.example.demo.impl;
}
