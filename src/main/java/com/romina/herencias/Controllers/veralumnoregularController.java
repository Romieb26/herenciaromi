package com.romina.herencias.Controllers;

import com.romina.herencias.HelloApplication;
import com.romina.herencias.Models.Alumnoregular;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class veralumnoregularController implements Initializable {

    @FXML
    private TableColumn<Alumnoregular, String> apellidoColumna;

    @FXML
    private TableColumn<Alumnoregular, String> areaColumna;

    @FXML
    private TableColumn<Alumnoregular, String> emailColumna;

    @FXML
    private TableView<Alumnoregular> empleadoTablaTable;

    @FXML
    private TableColumn<Alumnoregular, Integer> idColumna;

    @FXML
    private TableColumn<Alumnoregular, String> nombreColumna;

    @FXML
    private Button salirButton;

    @FXML
    private TableColumn<Alumnoregular, Integer> sueldoColumna;

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("regularMenu-view.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.nombreColumna.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.apellidoColumna.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.areaColumna.setCellValueFactory(new PropertyValueFactory<>("area"));
        this.emailColumna.setCellValueFactory(new PropertyValueFactory<>("email"));
        this.idColumna.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.sueldoColumna.setCellValueFactory(new PropertyValueFactory<>("sueldo"));

        this.empleadoTablaTable.setItems(HelloApplication.getCompletoComs());

    }
}
