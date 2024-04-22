package com.romina.herencias.Models;

import java.util.ArrayList;

public class Primaria {

    private ArrayList<Alumnoregular> listaAlumnoregular;
    public Primaria() {
        listaAlumnoregular = new ArrayList<>();}

    public ArrayList<Alumnoregular> getListaCompleto() {return listaAlumnoregular;}

    private String completo;

    public Primaria(String Completo) {this.completo = completo;}

    public String getCompleto() {return completo;}

    public void setCompleto(String Completo) {this.completo = Completo;}

}
