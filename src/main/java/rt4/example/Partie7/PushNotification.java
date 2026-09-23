package rt4.example.Partie7;

public class PushNotification implements NotificationStrategy {

    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification : " + message);
    }
}
