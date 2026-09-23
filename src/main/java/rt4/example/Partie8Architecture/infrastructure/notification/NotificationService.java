package rt4.example.Partie8Architecture.infrastructure.notification;

import rt4.example.Partie7StrategyPattern.NotificationStrategy;

public class NotificationService {

    private rt4.example.Partie7StrategyPattern.NotificationStrategy strategy;

    public NotificationService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void send(String message) {
        strategy.send(message);
    }
}
