package rt4.example.Partie6;

public class StockService implements Observer {

    @Override
    public void update(String status) {
        System.out.println(
                "StockService: Order status = " + status
        );
    }
}