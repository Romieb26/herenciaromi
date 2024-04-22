package com.romina.herencias.Controllers;

import com.romina.herencias.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class alumnoirregularMenuController {

    @FXML
    private Button SalirButton;

    @FXML
    private Button agregarButton;

    @FXML
    private Button buscarButton;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button verTablaButton;

    @FXML
    void OnClickedSalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("hello-view.fxml");
    }

    @FXML
    void OnClickedagregarButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("agregarIrregular-view.fxml");
    }

    @FXML
    void OnClickedbuscarButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("buscarirregular-view.fxml");
    }

    @FXML
    void OnClickedeliminarButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("eliminarirregular-view.fxml");
    }

    @FXML
    void OnClickedverTableButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("verirregular-view.fxml");
    }

}
