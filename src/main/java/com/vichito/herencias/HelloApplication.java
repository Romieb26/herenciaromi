package com.vichito.herencias;
import com.vichito.herencias.Models.BaseDatos;
import com.vichito.herencias.Models.Completo;
import com.vichito.herencias.Models.Empresa;
import com.vichito.herencias.Models.Parcial;
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

    //Empleado Completo

    private static Empresa empresa = new Empresa();
    private static ObservableList<Empresa> empresas = FXCollections.observableArrayList();
    public static Empresa getEmpresa(){ return empresa; }
    private static ObservableList<Empresa> getEmpresas(){ return empresas; }
    private static ObservableList<Completo> completoComs = FXCollections.observableArrayList();
    public static ObservableList<Completo> getCompletoComs(){ return completoComs; }

    //Empleado Parcial

    private static BaseDatos baseDato = new BaseDatos();
    private static ObservableList<BaseDatos> baseDatos = FXCollections.observableArrayList();
    public static BaseDatos getBaseDato(){ return baseDato; }
    private static ObservableList<BaseDatos> getBaseDatos(){ return baseDatos; }
    private static ObservableList<Parcial> parcialComs = FXCollections.observableArrayList();
    public static ObservableList<Parcial> getParcialComs(){ return parcialComs; }


    public static void main(String[] args) {
        launch();
    }
}