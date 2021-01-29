package org.iesfm.zoo.animal;

import java.util.Objects;

public class Animal {

    private String especie;
    private int edad;
    private String alimentacion;
    private int jaula;


    public Animal(String especie, int edad, String alimentacion, int jaula) {
        this.especie = especie;
        this.edad = edad;
        this.alimentacion = alimentacion;
        this.jaula = jaula;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getJaula() {
        return jaula;
    }

    public void setJaula(int jaula) {
        this.jaula = jaula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return edad == animal.edad && jaula == animal.jaula && Objects.equals(especie, animal.especie) && Objects.equals(alimentacion, animal.alimentacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie, edad, alimentacion, jaula);
    }
}
