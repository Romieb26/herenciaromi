package com.vichito.herencias.Controllers;

import com.vichito.herencias.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class eliminarCompletoController {

    @FXML
    private TextField IdEliminarTxt;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedeliminarButton(MouseEvent event) {

    }

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("completoMenu-view.fxml");
    }

}
