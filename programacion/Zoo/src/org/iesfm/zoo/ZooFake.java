package org.iesfm.zoo;

public class ZooFake implements Zoo {

    @Override
    public void printHerbivoros() {
        System.out.println("No hay herbivoros");
    }

    @Override
    public void printCarnivoros() {
        System.out.println("Hay tres leones");
    }

    @Override
    public void printOmnivoros() {
        System.out.println("Hay unos cerdos");
    }

    @Override
    public String nombreDelZoo() {
        return "Fake zoo";
    }

    @Override
    public void printAnimalesMayoresDe(int edad) {
        System.out.println("No hay animales mayores de  " + edad);
    }
}
