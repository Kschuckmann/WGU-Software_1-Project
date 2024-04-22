module java {
    requires javafx.controls;
    requires javafx.fxml;

    exports Controllers;
    opens Controllers to javafx.fxml;
    exports Models;
    opens Models to javafx.fxml;
}