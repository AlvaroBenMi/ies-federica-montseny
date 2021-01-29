package org.iesfm.zoo;

import org.iesfm.zoo.animal.Animal;

import java.util.Arrays;
import java.util.Objects;

public class ZooImpl implements Zoo {
    private String nombre;

    private Animal[] animales;

    public ZooImpl(String nombre, Animal[] animales) {
        this.nombre = nombre;
        this.animales = animales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    private void print(String alimentacion) {
        System.out.println("En el zoo " + nombre + " hay estos " + alimentacion);
        for (Animal animal : animales) {
            if (animal.getAlimentacion().equals(alimentacion)) {
                System.out.println(animal.getEspecie());
            }
        }
    }

    @Override
    public void printHerbivoros() {
        print("herbivoro");
    }

    @Override
    public void printCarnivoros() {
        print("carnivoro");
    }

    @Override
    public void printOmnivoros() {
        print("omnivoro");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooImpl that = (ZooImpl) o;
        return Objects.equals(nombre, that.nombre) && Arrays.equals(animales, that.animales);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(animales);
        return result;
    }

    @Override
    public String nombreDelZoo() {
        return getNombre();
    }

    @Override
    public void printAnimalesMayoresDe(int edad) {
        for (Animal animal : animales) {
            if(animal.getEdad() > edad) {
                System.out.println(animal.getEspecie());
            }
        }
    }
}
