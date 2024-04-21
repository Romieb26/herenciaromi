package com.vichito.herencias.Controllers;

import com.vichito.herencias.HelloApplication;
import com.vichito.herencias.Models.Completo;
import com.vichito.herencias.Models.Parcial;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        String area = areaTxt.getText();
        String email = emailTxt.getText();
        int id = Integer.parseInt(idTxt.getText());
        int horas = Integer.parseInt(horasTxt.getText());

        Parcial parcial = new Parcial(nombre,apellido,area,email,id,horas);

        if (!HelloApplication.getParcialComs().contains(parcial)){
            HelloApplication.getParcialComs().add(parcial);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hecho");
            alert.setContentText("Agregado con exito" + System.lineSeparator() + " Nombre del empleado :" + nombre + System.lineSeparator() + "Apellido del empleado :" + apellido + System.lineSeparator() + "Area del empleado : "+ area + System.lineSeparator() + "ID del empleado :" + id + System.lineSeparator() + "Correo Electronico del empleado :"+ email +System.lineSeparator()+ "Las Horas a trabar del empleado Son:" + horas );
            alert.showAndWait();
            System.out.println("Se agrego correctamente: " + nombre);
        }
        limpiar();
    }

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("parcialMenu-view.fxml");
    }

    public void limpiar(){
        nombreTxt.clear();
        apellidoTxt.clear();
        areaTxt.clear();
        emailTxt.clear();
        idTxt.clear();
        horasTxt.clear();
    }


}
