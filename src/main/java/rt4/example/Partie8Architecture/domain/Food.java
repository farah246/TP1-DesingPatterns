package rt4.example.Partie8Architecture.domain;

public class Food implements Product {

    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Food: " + name + " - " + price + " DT");
    }
}