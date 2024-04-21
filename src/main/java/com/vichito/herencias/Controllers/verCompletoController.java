package com.vichito.herencias.Controllers;

import com.vichito.herencias.HelloApplication;
import com.vichito.herencias.Models.Completo;
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

public class verCompletoController implements Initializable {

    @FXML
    private TableColumn<Completo, String> apellidoColumna;

    @FXML
    private TableColumn<Completo, String> areaColumna;

    @FXML
    private TableColumn<Completo, String> emailColumna;

    @FXML
    private TableView<Completo> empleadoTablaTable;

    @FXML
    private TableColumn<Completo, Integer> idColumna;

    @FXML
    private TableColumn<Completo, String> nombreColumna;

    @FXML
    private Button salirButton;

    @FXML
    private TableColumn<Completo, Integer> sueldoColumna;

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("completoMenu-view.fxml");
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
