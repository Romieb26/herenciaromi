package com.vichito.herencias.Controllers;

import com.vichito.herencias.HelloApplication;
import com.vichito.herencias.Models.Completo;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class agregarCompletoController {

    @FXML
    private TextField apellidoTxt;

    @FXML
    private TextField areaTxt;

    @FXML
    private TextField emailTxt;

    @FXML
    private Button guardarButton;

    @FXML
    private TextField idTxt;

    @FXML
    private TextField nombreTxt;

    @FXML
    private Button salirButton;

    @FXML
    private TextField sueldoTxt;

    @FXML
    void OnClickedguardarButton(MouseEvent event) {

        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        String area = areaTxt.getText();
        String email = emailTxt.getText();
        int id = Integer.parseInt(idTxt.getText());
        int sueldo = Integer.parseInt(sueldoTxt.getText());

        Completo completo = new Completo(nombre,apellido,area,email,id,sueldo);

        if (!HelloApplication.getCompletoComs().contains(completo)){
            HelloApplication.getCompletoComs().add(completo);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hecho");
            alert.setContentText("Agregado con exito" + System.lineSeparator() + " Nombre del empleado :" + nombre + System.lineSeparator() + "Apellido del empleado :" + apellido + System.lineSeparator() + "Area del empleado : "+ area + System.lineSeparator() + "ID del empleado :" + id + System.lineSeparator() + "Correo Electronico del empleado :"+ email +System.lineSeparator()+ "El sueldo del empleado" + sueldo );
            alert.showAndWait();
            System.out.println("Se agrego correctamente: " + nombre);
        }
        limpiar();
    }

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("completoMenu-view.fxml");
    }


        public void limpiar(){
        nombreTxt.clear();
        apellidoTxt.clear();
        areaTxt.clear();
        emailTxt.clear();
        idTxt.clear();
        sueldoTxt.clear();
    }
}
