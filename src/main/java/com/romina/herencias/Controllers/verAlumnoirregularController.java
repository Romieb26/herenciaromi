package com.romina.herencias.Controllers;

import com.romina.herencias.HelloApplication;
import com.romina.herencias.Models.Irregular;
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

public class verAlumnoirregularController implements Initializable {

    @FXML
    private TableColumn<Irregular, String> apellidoColumna;

    @FXML
    private TableColumn<Irregular, String> areaColumna;

    @FXML
    private TableColumn<Irregular, String> emailColumna;

    @FXML
    private TableView<Irregular> empleadoTablaTable;

    @FXML
    private TableColumn<Irregular, Integer> idColumna;

    @FXML
    private TableColumn<Irregular, String> nombreColumna;


    @FXML
    private Button salirButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.apellidoColumna.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.areaColumna.setCellValueFactory(new PropertyValueFactory<>("area"));
        this.emailColumna.setCellValueFactory(new PropertyValueFactory<>("email"));
        this.idColumna.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.nombreColumna.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        this.empleadoTablaTable.setItems(HelloApplication.getParcialComs());

    }


    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("irregularMenu-view.fxml");
    }

}
