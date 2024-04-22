package com.romina.herencias.Controllers;

import com.romina.herencias.HelloApplication;
import com.romina.herencias.Models.Alumnoregular;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class agregaralumnoregularController {

    @FXML
    private TextField apellidoTxt;

    @FXML
    private TextField aprobadasTxt;

    @FXML
    private TextField edadTxt;

    @FXML
    private TextField gradoTxt;

    @FXML
    private Button guardarButton;

    @FXML
    private TextField matriculaTxt;

    @FXML
    private TextField nombreTxt;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedguardarButton(MouseEvent event) {

        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        int edad = Integer.parseInt(edadTxt.getText());
        int grado = Integer.parseInt(gradoTxt.getText());
        int matricula = Integer.parseInt(matriculaTxt.getText());
        int aprobadas = Integer.parseInt(aprobadasTxt.getText());


        Alumnoregular alumnoregular = new Alumnoregular(nombre,apellido,edad,grado,matricula,aprobadas);

        if (!HelloApplication.getCompletoComs().contains(alumnoregular)){
            HelloApplication.getCompletoComs().add(alumnoregular);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Hecho");
            alert.setContentText("Agregado con exito" + System.lineSeparator() + " Nombre del empleado :" + nombre + System.lineSeparator() + "Apellido del empleado :" + apellido + System.lineSeparator() + "edad del alumno : "+ edad + System.lineSeparator() + "grado del alumno :" + grado+ System.lineSeparator() + "Matricula del alumno" + matricula  );
            alert.showAndWait();
            System.out.println("Se agrego correctamente: " + nombre);
        }
        limpiar();
    }

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("regularMenu-view.fxml");
    }


        public void limpiar(){
        nombreTxt.clear();
        apellidoTxt.clear();
        edadTxt.clear();
        gradoTxt.clear();
        matriculaTxt.clear();
        aprobadasTxt.clear();
    }
}
