package com.vichito.herencias.Models;

public class Empleado {

 private String nombre;
 private String apellido;
 private String area;
 private String email;
 private int id;

 public Empleado(String nombre, String apellido, String area, String email, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
        this.email = email;
        this.id = id;
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
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
