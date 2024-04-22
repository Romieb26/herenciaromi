package com.romina.herencias.Models;

public class Irregular extends Maestro {

        private double irregular;

        public Irregular(String nombre, String apellido , String area, String email, int id, double horas){
            super(nombre, apellido, area, email, id);
            this.irregular = horas;
        }

    public Irregular(String nombre, String apellido, String edad, int grado, String maestro) {
        super();
    }

    public double getHoras() {
        return irregular;
    }

    public void setIrregular(double irregular) {
        this.irregular = irregular;
    }
}
