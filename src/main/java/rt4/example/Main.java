package rt4.example;

public class Main {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        orderService.createOrder(
                "BOOK",
                "Clean Code",
                80
        );

        orderService.createOrder(
                "ELECTRONIC",
                "Laptop",
                2500
        );

        orderService.createOrder(
                "CLOTHING",
                "T-Shirt",
                50
        );

        orderService.createOrder(
                "FOOD",
                "Pizza",
                25
        );
    }
}