package com.vichito.herencias.Controllers;

import com.vichito.herencias.HelloApplication;
import com.vichito.herencias.Models.Completo;
import com.vichito.herencias.Models.Parcial;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class eliminarParcialController {

    @FXML
    private TextField IdEliminarTxt;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedeliminarButton(MouseEvent event) {
        int id = Integer.parseInt(IdEliminarTxt.getText());

        ObservableList<Parcial> listaParcial = HelloApplication.getParcialComs();

        Parcial parcialEliminar = null;
        for(Parcial parcial : listaParcial) {
            if(parcial.getId() == id) {
                parcialEliminar = parcial;
                break;
            }
        }
        if(parcialEliminar != null) {
            listaParcial.remove(parcialEliminar);
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
        limpiar();
    }

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("parcialMenu-view.fxml");
    }

    public void limpiar(){
        IdEliminarTxt.clear();
    }

}
