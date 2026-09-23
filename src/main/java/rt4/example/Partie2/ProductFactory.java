package rt4.example.Partie2;

import rt4.example.Partie2.*;

public class ProductFactory {

    public static Product createProduct(String type, String name, double price) {

        if (type.equals("BOOK")) {
            return new Book(name, price);
        }
        else if (type.equals("ELECTRONIC")) {
            return new Electronic(name, price);
        }
        else if (type.equals("CLOTHING")) {
            return new Clothing(name, price);
        }
        else if (type.equals("FOOD")) {
            return new Food(name, price);
        }
        else {
            throw new IllegalArgumentException("Unknown product type");
        }
    }
}