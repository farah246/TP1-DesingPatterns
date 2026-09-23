package rt4.example;

public class OrderService {

    public void createOrder(String type, String name, double price) {

        Product product = ProductFactory.createProduct(type, name, price);

        System.out.println("Order created:");
        product.display();
    }
}