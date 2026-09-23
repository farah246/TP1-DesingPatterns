package rt4.example.Partie7StrategyPattern;

public class WhatsAppNotification implements NotificationStrategy {

    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp : " + message);
    }
}
