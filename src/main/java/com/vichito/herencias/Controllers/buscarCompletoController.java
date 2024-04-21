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

public class buscarCompletoController {

    @FXML
    private TextField IdBuscarTxt;

    @FXML
    private Button buscarButton;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedbuscarButton(MouseEvent event) {
        int id = Integer.parseInt(IdBuscarTxt.getText());

        ObservableList<Completo> lista = HelloApplication.getCompletoComs();

        Completo completoEncontrado = null;
        for (Completo completo : lista) {
            if (completo.getId() == id) {
                completoEncontrado = completo;
                break;
            }
        }

        if (completoEncontrado != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Exitosa");
            alert.setContentText("Se a encontrado al empleado" + completoEncontrado.getNombre()+ System.lineSeparator());
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Fallida");
            alert.setContentText("No se encontró el Empleado De tiempo Completo.  :C");
            alert.showAndWait();
    }
        limpiar();
    }

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("completoMenu-view.fxml");
    }

    public void limpiar(){
        IdBuscarTxt.clear();
    }

}
