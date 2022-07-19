package decoratorPattern;

public class Cappacino implements Drink{

    @Override
    public int calculateCost() {
        return 120;
    }
}
