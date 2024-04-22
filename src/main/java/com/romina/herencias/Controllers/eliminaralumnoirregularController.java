package com.romina.herencias.Controllers;

import com.romina.herencias.HelloApplication;
import com.romina.herencias.Models.Irregular;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class eliminaralumnoirregularController {


    @FXML
    private TextField gradoEliminarTxt;

    @FXML
    private Button eliminarButton;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedeliminarButton(MouseEvent event) {
        int matricula = Integer.parseInt(gradoEliminarTxt.getText());

        ObservableList<Irregular> listaIrregular = HelloApplication.getParcialComs();

        Irregular irregularEliminar = null;
        for(Irregular irregular : listaIrregular) {
            if(irregular.getMatricula() == matricula) {
                irregularEliminar = irregular;
                break;
            }
        }
        if(irregularEliminar != null) {
            listaIrregular.remove(irregularEliminar);
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
        escena.changeScene("irregularMenu-view.fxml");
    }

    public void limpiar(){
        gradoEliminarTxt.clear();
    }

}
