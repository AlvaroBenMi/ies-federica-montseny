package org.iesfm.zoo;

import org.iesfm.zoo.animal.Animal;

import java.util.Scanner;

public class ZooMain {

    private static Scanner scan = new Scanner(System.in);

    private static Zoo pideZooInMemory() {
        System.out.println("Introduce nombre del zoo");
        String nombre = scan.next();
        System.out.println("Cuantos animales quieres");
        Animal[] animales = new Animal[scan.nextInt()];
        for(int i = 0; i <animales.length; i++) {
            animales[i] = pideAnimal();
        }
        return new ZooImpl(nombre, animales);
    }

    private static Animal pideAnimal() {
        System.out.println("Introduce especie");
        String especie = scan.next();
        System.out.println("Introduce edad");
        int edad = scan.nextInt();
        System.out.println("Introduce alimentacion");
        String alimentacion = scan.next();
        System.out.println("Introduce jaula");
        int jaula = scan.nextInt();
        return new Animal(especie, edad, alimentacion, jaula);
    }

    private static Zoo pideZooFake() {
        return new ZooFake();
    }

    private static Zoo pideZoo() {
        System.out.println("Qué clase de Zoo quieres crear?");
        String tipo = scan.next();

        if(tipo.equals("fake")) {
            return pideZooFake();
        } else {
            return pideZooInMemory();
        }
    }

    public static void main(String[] args) {
        Zoo zoo = pideZoo();

        String nombre = zoo.nombreDelZoo();

        System.out.println("El zoo se llama " + nombre);

        zoo.printHerbivoros();
        zoo.printCarnivoros();
        zoo.printOmnivoros();

        zoo.printAnimalesMayoresDe(10);
    }
}
