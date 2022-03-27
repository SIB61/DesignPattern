package decoratorPattern;

public class Sugar extends AddOns{
    Sugar(Drink drink) {
        super(drink.calculateCost());
    }
    @Override
    int calculateCost() {
        return price+10;
    }
}
