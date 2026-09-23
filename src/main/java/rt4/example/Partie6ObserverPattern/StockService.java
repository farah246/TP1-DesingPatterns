package rt4.example.Partie6ObserverPattern;

public class StockService implements Observer {

    @Override
    public void update(String status) {
        System.out.println(
                "StockService: Order status = " + status
        );
    }
}