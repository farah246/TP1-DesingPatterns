package rt4.example.Partie6ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject {

    private String status;

    private List<Observer> observers = new ArrayList<>();

    public Order() {
        this.status = "CREATED";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}