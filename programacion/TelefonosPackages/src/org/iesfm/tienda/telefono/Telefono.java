package org.iesfm.tienda.telefono;

import java.util.Objects;

public class Telefono {

    private String modelo;
    private int stock;
    private double price;

    public Telefono(String modelo, int stock, double price) {
        this.modelo = modelo;
        this.stock = stock;
        this.price = price;
    }


    public boolean hayStock() {
        return stock > 0;
    }

    public boolean hayStock(int cantidad) {
        return stock >= cantidad;
    }

    public void vender() {
        if (hayStock()) {
            stock--;
            System.out.println("Aquí tiene su " + modelo + ", son " + price + " euros");
        } else {
            System.out.println("No quedan " + modelo);
        }
    }

    public void vender(int cantidad) {
        if (hayStock(cantidad)) {
            stock -= cantidad;
            System.out.println("Aquí tiene su " + modelo + ", son " + cantidad * price + " euros");
        } else {
            System.out.println("No hay suficientes " + modelo);
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefono telefono = (Telefono) o;
        return stock == telefono.stock && Double.compare(telefono.price, price) == 0 && Objects.equals(modelo, telefono.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, stock, price);
    }
}
