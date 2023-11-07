package observer;

public interface Subject {

    public void addObservers(Observer obs);
    public void removeObserver(Observer obs);

    public void notifyObservers();
}
