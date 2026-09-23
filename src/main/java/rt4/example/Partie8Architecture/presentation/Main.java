package rt4.example.Partie8Architecture.presentation;

import rt4.example.Partie8Architecture.application.OrderService;
import rt4.example.Partie8Architecture.domain.Order;
import rt4.example.Partie8Architecture.infrastructure.config.ApplicationConfig;
import rt4.example.Partie8Architecture.infrastructure.notification.EmailNotification;
import rt4.example.Partie8Architecture.infrastructure.notification.NotificationService;
import rt4.example.Partie8Architecture.infrastructure.payment.OldPaymentSystem;
import rt4.example.Partie8Architecture.infrastructure.payment.PaymentAdapter;
import rt4.example.Partie8Architecture.infrastructure.payment.PaymentService;

public class Main {

    public static void main(String[] args) {



        ApplicationConfig config1 = ApplicationConfig.getInstance();
        ApplicationConfig config2 = ApplicationConfig.getInstance();

        System.out.println("Singleton test:");
        System.out.println("config1 == config2 : " + (config1 == config2));

        config1.setApplicationName("Bookstore");
        config1.setDatabaseUrl(
                "jdbc:postgresql://localhost:5432/bookstore"
        );

        System.out.println("Application: "
                + config2.getApplicationName());

        System.out.println("Database: "
                + config2.getDatabaseUrl());




        OrderService orderService = new OrderService();

        Order order = orderService.createOrder(
                "BOOK",
                "Clean Code",
                80
        );




        PaymentService payment =
                new PaymentAdapter(
                        new OldPaymentSystem()
                );

        payment.pay(80);




        NotificationService notification =
                new NotificationService(
                        new EmailNotification()
                );

        notification.send(
                "Your order has been created."
        );




        orderService.updateOrderStatus(
                order,
                "SHIPPED"
        );
    }
}