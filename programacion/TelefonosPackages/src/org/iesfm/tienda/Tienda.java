package org.iesfm.tienda;

import org.iesfm.tienda.telefono.Telefono;

import java.util.Scanner;

public class Tienda {

    private static Scanner scan =  new Scanner(System.in);
    public static void main(String[] args) {
        Telefono telefono1 = new Telefono("iPhone", 10, 1000);
        Telefono telefono2 = new Telefono("iPhone", 10, 1000);

        if(telefono1.equals(telefono2)) {
            System.out.println("es igual");
        }else {
            System.out.println(" no son iguales");
        }
    }
}
