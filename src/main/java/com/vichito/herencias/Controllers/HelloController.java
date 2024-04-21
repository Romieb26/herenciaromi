package com.vichito.herencias.Controllers;

import com.vichito.herencias.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button SalirButton;

    @FXML
    private Button empleadoCompletoButton;

    @FXML
    private Button empleadoParcialButton;

    @FXML
    void OnClickedSalirButton(MouseEvent event) {
    System.exit(0);
    }

    @FXML
    void OnClickedempleadoCompletoButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("completoMenu-view.fxml");
    }

    @FXML
    void OnClickedempleadoParcialButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("parcialMenu-view.fxml");
    }

}
