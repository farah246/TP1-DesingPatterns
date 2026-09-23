package rt4.example.Partie7;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Sending Email : " + message);
    }
}
