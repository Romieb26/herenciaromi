package com.romina.herencias.Models;

import java.util.ArrayList;

public class BaseDatos {

    ArrayList<Irregular> listaIrregular;
    public BaseDatos() {
        listaIrregular = new ArrayList<>();}

    public ArrayList<Irregular> getListaParcial() {return listaIrregular;}

    private String irregular;

    public BaseDatos(String parcial) {this.irregular= irregular;}

    public String getParcial() {return irregular;}

    public void setParcial(String parcial) {this.irregular = irregular;}
}
