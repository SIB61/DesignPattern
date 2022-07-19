package decoratorPattern;

public class ColdCoffee implements Drink{
    @Override
    public int calculateCost() {
        return 80;
    }
}
