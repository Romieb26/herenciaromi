package com.vichito.herencias.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class verParcialController {

    @FXML
    private TableColumn<?, ?> apellidoColumna;

    @FXML
    private TableColumn<?, ?> areaColumna;

    @FXML
    private TableColumn<?, ?> emailColumna;

    @FXML
    private TableView<?> empleadoTablaTable;

    @FXML
    private TableColumn<?, ?> horasColumna;

    @FXML
    private TableColumn<?, ?> idColumna;

    @FXML
    private TableColumn<?, ?> nombreColumna;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedsalirButton(MouseEvent event) {

    }

}
