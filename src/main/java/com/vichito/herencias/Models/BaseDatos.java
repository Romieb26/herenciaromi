package com.vichito.herencias.Models;

import java.util.ArrayList;

public class BaseDatos {

    ArrayList<Parcial> listaParcial;
    public BaseDatos() {listaParcial = new ArrayList<>();}

    public ArrayList<Parcial> getListaParcial() {return listaParcial;}

    private String parcial;

    public BaseDatos(String parcial) {this.parcial = parcial;}

    public String getParcial() {return parcial;}

    public void setParcial(String parcial) {this.parcial = parcial;}
}
