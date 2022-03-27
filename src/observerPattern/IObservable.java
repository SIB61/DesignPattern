package observerPattern;

import java.util.ArrayList;
import java.util.List;

public interface IObservable {
    List<IObserver> observers = new ArrayList<>();
    void addObserver(IObserver observer);
    void deleteObserver(IObserver observer);
    void notifyObservers();
}
