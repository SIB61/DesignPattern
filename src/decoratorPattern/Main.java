package decoratorPattern;

public class Main {
    public static void main(String[] args) {
       Drink drink = new Sugar(new Chocolate(new Sugar(new Chocolate(new Cappacino()))));
       System.out.println(drink.calculateCost());
    }
}
