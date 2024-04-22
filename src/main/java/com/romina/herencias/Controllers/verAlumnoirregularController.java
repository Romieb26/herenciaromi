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
    private TableView<Irregular> alumnosRegularesTablaTable;

    @FXML
    private TableColumn<Irregular, String> apellidoColumna;

    @FXML
    private TableColumn<Irregular, Integer> edadColumna;

    @FXML
    private TableColumn<Irregular, Integer> gradoColumna;

    @FXML
    private TableColumn<Irregular, Integer> matriculaColumna;

    @FXML
    private TableColumn<Irregular, String> nombreColumna;

    @FXML
    private TableColumn<Irregular, Integer> reprobadasColumna;
    @FXML
    private Button salirButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.apellidoColumna.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.gradoColumna.setCellValueFactory(new PropertyValueFactory<>("grado"));
        this.matriculaColumna.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        this.edadColumna.setCellValueFactory(new PropertyValueFactory<>("edad"));
        this.nombreColumna.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.reprobadasColumna.setCellValueFactory(new PropertyValueFactory<>("reprobadas"));

        this.alumnosRegularesTablaTable.setItems(HelloApplication.getParcialComs());

    }


    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("irregularMenu-view.fxml");
    }

}
