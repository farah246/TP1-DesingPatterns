package rt4.example.Partie8Architecture.domain;

public class Book implements Product {

    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Book: " + name + " - " + price + " DT");
    }
}