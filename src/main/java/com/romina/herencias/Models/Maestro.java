package com.romina.herencias.Models;

public class Maestro {

 private String nombre;
 private String apellido;
 private int edad;
 private int grado;
 private int matricula;

 public Maestro(String nombre, String apellido, int edad, int grado, int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.grado= grado;
        this.matricula = matricula;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
