package com.romina.herencias.Models;

public class Alumnoregular extends Maestro {

    private double sueldo;

    public Alumnoregular(String nombre, String apellido , String edad, String grado, int maestro) {
        super(nombre,apellido,edad,grado,maestro);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
