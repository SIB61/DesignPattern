package decoratorPattern;

public class Chocolate extends AddOns{
    Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public int calculateCost() {
        return drink.calculateCost()+25;
    }
}
