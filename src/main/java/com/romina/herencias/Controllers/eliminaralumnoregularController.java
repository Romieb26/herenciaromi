package com.romina.herencias.Controllers;

import com.romina.herencias.HelloApplication;
import com.romina.herencias.Models.Alumnoregular;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class eliminaralumnoregularController {

    @FXML
    private Button eliminarButton;

    @FXML
    private TextField matriculaliminarTxt;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedeliminarButton(MouseEvent event) {
        int matricula = Integer.parseInt(matriculaliminarTxt.getText());

        ObservableList<Alumnoregular> listaAlumnoregular = HelloApplication.getCompletoComs();

        Alumnoregular alumnoregularEliminar = null;
        for(Alumnoregular alumnoregular : listaAlumnoregular) {
            if(alumnoregular.getMatricula() == matricula) {
                alumnoregularEliminar = alumnoregular;
                break;
            }
        }
        if(alumnoregularEliminar != null) {
            listaAlumnoregular.remove(alumnoregularEliminar);
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
        escena.changeScene("regularMenu-view.fxml");
    }

    public void limpiar(){
        matriculaliminarTxt.clear();
    }

}
