package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Observable implements IObservable{
    public int state = 10 ;
    List<IObserver> observers = new ArrayList<>();
    @Override
    public void addObserver(IObserver observer) {
         observers.add(observer);
    }

    @Override
    public void deleteObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(this);
        });
    }
}
