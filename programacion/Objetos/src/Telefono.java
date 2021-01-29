public class Telefono {

    private String model;
    private double price;
    private int stock;


    public Telefono(String model, double price, int stock) {
        this.model = model;
        this.price = price;
        this.stock = stock;
    }

    public Telefono(String model, double price) {
        // this(model, price, 10);
        this.model = model;
        this.price = price;
        this.stock = 10;
    }

    public boolean hasStock() {
        return stock > 0;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
