package rt4.example.Partie2FactoryPattern;

public class OrderService {

    public void createOrder(String type, String name, double price) {

        Product product = ProductFactory.createProduct(type, name, price);

        System.out.println("Order created:");
        product.display();
    }
}