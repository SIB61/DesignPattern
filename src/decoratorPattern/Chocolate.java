package decoratorPattern;

public class Chocolate extends AddOns{
    Chocolate(Drink drink) {
        super(drink.calculateCost());
    }

    @Override
    int calculateCost() {
        return price+25;
    }
}
