package rt4.example.Partie6ObserverPattern;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}