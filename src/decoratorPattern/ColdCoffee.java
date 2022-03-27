package decoratorPattern;

public class ColdCoffee extends Drink{
    @Override
    int calculateCost() {
        return 80;
    }
}
