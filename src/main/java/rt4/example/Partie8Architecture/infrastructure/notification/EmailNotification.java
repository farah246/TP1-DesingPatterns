package rt4.example.Partie8Architecture.infrastructure.notification;

import rt4.example.Partie7StrategyPattern.NotificationStrategy;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Sending Email : " + message);
    }
}
