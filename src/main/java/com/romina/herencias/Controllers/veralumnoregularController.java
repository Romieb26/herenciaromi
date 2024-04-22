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
    private TableView<Alumnoregular> alumnosAprobadosTablaTable;

    @FXML
    private TableColumn<Alumnoregular, String> apellidoColumna;

    @FXML
    private TableColumn<Alumnoregular, Integer> aprobadasColumna;

    @FXML
    private TableColumn<Alumnoregular, Integer> edadColumna;

    @FXML
    private TableColumn<Alumnoregular, Integer> gradoColumna;

    @FXML
    private TableColumn<Alumnoregular, Integer> matriculaColumna;

    @FXML
    private TableColumn<Alumnoregular, String> nombreColumna;

    @FXML
    private Button salirButton;

    @FXML
    void OnClickedsalirButton(MouseEvent event) throws IOException {
        HelloApplication escena = new HelloApplication();
        escena.changeScene("regularMenu-view.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        this.nombreColumna.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.apellidoColumna.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.matriculaColumna.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        this.edadColumna.setCellValueFactory(new PropertyValueFactory<>("edad"));
        this.aprobadasColumna.setCellValueFactory(new PropertyValueFactory<>("aprobadas"));
        this.gradoColumna.setCellValueFactory(new PropertyValueFactory<>("grado"));

        this.alumnosAprobadosTablaTable.setItems(HelloApplication.getCompletoComs());

    }
}
