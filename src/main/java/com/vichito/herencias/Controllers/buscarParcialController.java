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

public class buscarParcialController {

    @FXML
    private TextField IdBuscarTxt;

    @FXML
    private Button buscarButton;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedbuscarButton(MouseEvent event) {
        int id = Integer.parseInt(IdBuscarTxt.getText());

        ObservableList<Parcial> lista = HelloApplication.getParcialComs();

        Parcial parcialEncontrado = null;
        for (Parcial parcial : lista) {
            if (parcial.getId() == id) {
                parcialEncontrado = parcial;
                break;
            }
        }

        if (parcialEncontrado != null) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Exitosa");
            alert.setContentText("Se a encontrado al empleado :" + parcialEncontrado.getNombre()+ System.lineSeparator());
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Búsqueda Fallida");
            alert.setContentText("No se encontró el empleado de tiempo Parcial.  :C");
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
        IdBuscarTxt.clear();
    }
}
