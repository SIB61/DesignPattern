package observerPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Observable observable = new Observable();

      // first observer added
      Observer observer = new Observer();
      observable.addObserver(observer);

      // second observer added
      Observer observer1 = new Observer();
      observable.addObserver(observer1);

      // third observer added
      Observer observer2 = new Observer();
      observable.addObserver(observer2);

       //change in observable
       observable.state=new Scanner(System.in).nextInt();

       //notify all observers
        observable.notifyObservers();
    }
}
