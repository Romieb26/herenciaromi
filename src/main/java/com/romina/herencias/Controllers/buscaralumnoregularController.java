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

public class buscaralumnoregularController {

    @FXML
    private TextField gradoBuscarTxt;

    @FXML
    private Button buscarButton;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedbuscarButton(MouseEvent event) {
        int id = Integer.parseInt(gradoBuscarTxt.getText());

        ObservableList<Alumnoregular> lista = HelloApplication.getCompletoComs();

        Alumnoregular alumnoregularEncontrado = null;
        for (Alumnoregular alumnoregular : lista) {
            String grado = null;
            if (alumnoregular.getGrado() == grado) {
                alumnoregularEncontrado = alumnoregular;
                break;
            }
        }

        if (alumnoregularEncontrado != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Exitosa");
            alert.setContentText("Se a encontrado al empleado" + alumnoregularEncontrado.getNombre()+ System.lineSeparator());
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Fallida");
            alert.setContentText("No se encontró el Maestro De tiempo Alumnoregular.  :C");
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
        gradoBuscarTxt.clear();
    }

}
