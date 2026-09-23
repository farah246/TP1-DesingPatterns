package rt4.example.Partie2FactoryPattern;

public class Clothing implements Product {

    private String name;
    private double price;

    public Clothing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Clothing: " + name + " - " + price + " DT");
    }
}