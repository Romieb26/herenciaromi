module com.romina.herencias {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.romina.herencias.Models to javafx.base;

    opens com.romina.herencias to javafx.fxml;
    exports com.romina.herencias;
    exports com.romina.herencias.Controllers;
    opens com.romina.herencias.Controllers to javafx.fxml;
}