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

public class buscaralumnoirregularController {

    @FXML
    private Button buscarButton;

    @FXML
    private TextField matriculaBuscarTxt;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedbuscarButton(MouseEvent event) {
        int matricula = Integer.parseInt(matriculaBuscarTxt.getText());

        ObservableList<Irregular> lista = HelloApplication.getParcialComs();

        Irregular irregularEncontrado = null;
        for (Irregular irregular : lista) {
            if (irregular.getMatricula() == matricula) {
                irregularEncontrado = irregular;
                break;
            }
        }

        if (irregularEncontrado != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Exitosa");
            alert.setContentText("Se a encontrado al empleado :" + irregularEncontrado.getNombre()+ System.lineSeparator());
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Fallida");
            alert.setContentText("No se encontró el empleado de tiempo Irregular.  :C");
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
        matriculaBuscarTxt.clear();
    }
}
