package observerPattern;

public class Observer implements IObserver{
    int x = 10 ;
    void executeSome(){
        System.out.println(x);
    }
    @Override
    public void update(IObservable observable) {
        Observable observable1 = (Observable) observable;
        x=observable1.state;
        System.out.println("observable state has been changed; new state = "+ x);
    }
}
