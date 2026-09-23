package rt4.example.Partie7StrategyPattern;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Sending Email : " + message);
    }
}
