package observerPattern;

import java.util.ArrayList;
import java.util.List;

public interface IObservable {

    void addObserver(IObserver observer);
    void deleteObserver(IObserver observer);
    void notifyObservers();
}
