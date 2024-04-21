package com.vichito.herencias.Controllers;

import com.vichito.herencias.HelloApplication;
import com.vichito.herencias.Models.Parcial;
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

public class verParcialController implements Initializable {

    @FXML
    private TableColumn<Parcial, String> apellidoColumna;

    @FXML
    private TableColumn<Parcial, String> areaColumna;

    @FXML
    private TableColumn<Parcial, String> emailColumna;

    @FXML
    private TableView<Parcial> empleadoTablaTable;

    @FXML
    private TableColumn<Parcial, Integer> horasColumna;

    @FXML
    private TableColumn<Parcial, Integer> idColumna;

    @FXML
    private TableColumn<Parcial, String> nombreColumna;

    @FXML
    private Button salirButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.apellidoColumna.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.areaColumna.setCellValueFactory(new PropertyValueFactory<>("area"));
        this.emailColumna.setCellValueFactory(new PropertyValueFactory<>("email"));
        this.horasColumna.setCellValueFactory(new PropertyValueFactory<>("horas"));
        this.idColumna.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.nombreColumna.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        this.empleadoTablaTable.setItems(HelloApplication.getParcialComs());

    }


    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("parcialMenu-view.fxml");
    }

}
