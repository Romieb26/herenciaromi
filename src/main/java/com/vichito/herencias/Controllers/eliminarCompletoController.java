package com.vichito.herencias.Controllers;

import com.vichito.herencias.HelloApplication;
import com.vichito.herencias.Models.Completo;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
        int id = Integer.parseInt(IdEliminarTxt.getText());

        ObservableList<Completo> listaCompleto = HelloApplication.getCompletoComs();

        Completo completoEliminar = null;
        for(Completo completo : listaCompleto) {
            if(completo.getId() == id) {
                completoEliminar = completo;
                break;
            }
        }
        if(completoEliminar != null) {
            listaCompleto.remove(completoEliminar);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hecho");
            alert.setContentText("Se elimino con exito");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("No se encontro ningun empleado con ese ID");
            alert.showAndWait();
        }
    }

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("completoMenu-view.fxml");
    }

}
