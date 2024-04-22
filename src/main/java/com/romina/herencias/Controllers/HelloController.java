package com.romina.herencias.Controllers;

import com.romina.herencias.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button SalirButton;

    @FXML
    private Button alumnoirregularButton;

    @FXML
    private Button alumoregularButton;

    @FXML
    void OnClickedSalirButton(MouseEvent event) {
    System.exit(0);
    }

    @FXML
    void OnClickedempleadoCompletoButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("regularMenu-view.fxml");
    }

    @FXML
    void OnClickedempleadoParcialButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("irregularMenu-view.fxml");
    }

}
