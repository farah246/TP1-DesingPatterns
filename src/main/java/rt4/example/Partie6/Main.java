package rt4.example.Partie6;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();

        order.attach(new EmailService());
        order.attach(new StockService());
        order.attach(new LoggerService());

        System.out.println("Changing status to SHIPPED...");

        order.setStatus("SHIPPED");
    }
}