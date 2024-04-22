package com.romina.herencias.Models;

public class Maestro {

 private String nombre;
 private String apellido;
 private String edad;
 private String grado;
 private int maestro;

 public Maestro(String nombre, String apellido, String area, String email, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.grado= grado;
        this.maestro= maestro;
 }

    public Maestro() {

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getArea() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getMaestro() {
        return maestro;
    }

    public void setMaestro(int maestro) {
        this.maestro= maestro;
    }
}
