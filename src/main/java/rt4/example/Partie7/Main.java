package rt4.example.Partie7;

public class Main {

    public static void main(String[] args) {

        NotificationService emailService =
                new NotificationService(new EmailNotification());

        emailService.send("Hello");

        NotificationService smsService =
                new NotificationService(new SMSNotification());

        smsService.send("Hello");

        NotificationService pushService =
                new NotificationService(new PushNotification());

        pushService.send("Hello");

        NotificationService whatsappService =
                new NotificationService(new WhatsAppNotification());

        whatsappService.send("Hello");
    }
}