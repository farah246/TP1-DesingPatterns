package rt4.example.Partie6ObserverPattern;

public class LoggerService implements Observer {

    @Override
    public void update(String status) {
        System.out.println(
                "LoggerService: Order status = " + status
        );
    }
}