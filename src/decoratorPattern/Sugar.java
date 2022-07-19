package decoratorPattern;

public class Sugar extends AddOns{
    Sugar(Drink drink) {
        super(drink);
    }
    @Override
    public int calculateCost() {
        return drink.calculateCost()+10;
    }
}
