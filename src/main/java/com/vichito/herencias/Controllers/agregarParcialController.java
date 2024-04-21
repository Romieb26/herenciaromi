package com.vichito.herencias.Controllers;

import com.vichito.herencias.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class agregarParcialController {

    @FXML
    private TextField apellidoTxt;

    @FXML
    private TextField areaTxt;

    @FXML
    private TextField emailTxt;

    @FXML
    private Button guardarButton;

    @FXML
    private TextField horasTxt;

    @FXML
    private TextField idTxt;

    @FXML
    private TextField nombreTxt;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedguardarButton(MouseEvent event) {

    }

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("parcialMenu-view.fxml");
    }

}
