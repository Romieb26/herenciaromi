package com.vichito.herencias.Models;

public class Completo extends Empleado{

    private double sueldo;

    public Completo(String nombre, String apellido , String area, String email, int id, double sueldo) {
        super(nombre,apellido,area,email,id);
        this.sueldo = sueldo;
    }
}
