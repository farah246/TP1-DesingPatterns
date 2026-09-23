package rt4.example.Partie6;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}