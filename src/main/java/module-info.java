module com.vichito.herencias {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vichito.herencias to javafx.fxml;
    exports com.vichito.herencias;
    exports com.vichito.herencias.Controllers;
    opens com.vichito.herencias.Controllers to javafx.fxml;
}