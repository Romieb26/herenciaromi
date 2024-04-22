package com.romina.herencias.Models;

public class Irregular extends Maestro {

        private int reprobadas;

        public Irregular(String nombre, String apellido , int reprobadas, int edad, int grado, int matricula){
            super(nombre, apellido, edad,grado , matricula);
            this.reprobadas =reprobadas;
        }

    public Irregular(String nombre, String apellido, String edad, int grado, String maestro) {
        super();
    }

    public int getReprobadas() {
        return reprobadas;
    }

    public void setReprobadas(int reprobadas) {
        this.reprobadas = reprobadas;
    }
}
