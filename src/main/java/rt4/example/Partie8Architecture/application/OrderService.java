package rt4.example.Partie8Architecture.application;

import rt4.example.Partie8Architecture.domain.Order;
import rt4.example.Partie8Architecture.domain.Product;
import rt4.example.Partie8Architecture.domain.ProductFactory;

public class OrderService {

    public Order createOrder(
            String type,
            String name,
            double price) {

        Product product =
                ProductFactory.createProduct(
                        type,
                        name,
                        price
                );

        Order order = new Order(product);

        System.out.println("Order created:");
        product.display();

        return order;
    }

    public void updateOrderStatus(
            Order order,
            String status) {

        order.setStatus(status);

        System.out.println(
                "Order status changed to: " + status
        );
    }
}