package decoratorPattern;

public class Nescafe implements Drink{
    @Override
    public int calculateCost() {
        return 50;
    }
}
