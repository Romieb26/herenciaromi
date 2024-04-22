package com.romina.herencias.Models;

public class Alumnoregular extends Maestro {

    private int aprobadas;

    public Alumnoregular(String nombre, String apellido , int edad, int grado , int matricula) {
        super(nombre,apellido,edad,grado,matricula);
        this.aprobadas = aprobadas;
    }

    public int getAprobadas() {
        return aprobadas;
    }

    public void setAprobadas(int reprobadas) {
        this.aprobadas = aprobadas;
    }
}
