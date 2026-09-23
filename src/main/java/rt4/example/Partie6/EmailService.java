package rt4.example.Partie6;

public class EmailService implements Observer {

    @Override
    public void update(String status) {
        System.out.println(
                "EmailService: Order status = " + status
        );
    }
}