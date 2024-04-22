package com.romina.herencias;
import com.romina.herencias.Models.Alumnoregular;
import com.romina.herencias.Models.BaseDatos;
import com.romina.herencias.Models.Irregular;
import com.romina.herencias.Models.Primaria;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private  static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Herencia");
        stage.setScene(scene);
        stage.show();
    }


    public void changeScene(String fxml)throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    //Maestro Alumnoregular

    private static Primaria primaria = new Primaria();
    private static ObservableList<Primaria> primarias = FXCollections.observableArrayList();
    public static Primaria getEmpresa(){ return primaria; }
    private static ObservableList<Primaria> getEmpresas(){ return primarias; }
    private static ObservableList<Alumnoregular> alumnoregularComs = FXCollections.observableArrayList();
    public static ObservableList<Alumnoregular> getCompletoComs(){ return alumnoregularComs; }

    //Maestro Irregular

    private static BaseDatos baseDato = new BaseDatos();
    private static ObservableList<BaseDatos> baseDatos = FXCollections.observableArrayList();
    public static BaseDatos getBaseDato(){ return baseDato; }
    private static ObservableList<BaseDatos> getBaseDatos(){ return baseDatos; }
    private static ObservableList<Irregular> irregularComs = FXCollections.observableArrayList();
    public static ObservableList<Irregular> getParcialComs(){ return irregularComs; }


    public static void main(String[] args) {
        launch();
    }
}