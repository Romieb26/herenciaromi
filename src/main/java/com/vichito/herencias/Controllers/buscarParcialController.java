package com.vichito.herencias.Controllers;

import com.vichito.herencias.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class buscarParcialController {

    @FXML
    private TextField IdBuscarTxt;

    @FXML
    private Button buscarButton;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedbuscarButton(MouseEvent event) {

    }

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("parcialMenu-view.fxml");
    }

}
