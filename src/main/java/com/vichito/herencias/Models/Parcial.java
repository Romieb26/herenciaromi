package com.vichito.herencias.Models;

public class Parcial extends Empleado{

        private double horas;

        public Parcial(String nombre, String apellido , String area, String email, int id, double horas){
            super(nombre, apellido, area, email, id);
            this.horas = horas;
        }
}
