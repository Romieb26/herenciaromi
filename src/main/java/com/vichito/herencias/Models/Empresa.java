package com.vichito.herencias.Models;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Completo> listaCompleto;
    public Empresa() {listaCompleto = new ArrayList<>();}

    public ArrayList<Completo> getListaCompleto() {return listaCompleto;}

    private String completo;

    public Empresa(String Completo) {this.completo = completo;}

    public String getCompleto() {return completo;}

    public void setCompleto(String Completo) {this.completo = Completo;}

}
