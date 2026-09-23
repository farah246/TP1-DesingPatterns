package rt4.example;

public class Electronic implements Product {

    private String name;
    private double price;

    public Electronic(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Electronic: " + name + " - " + price + " DT");
    }
}