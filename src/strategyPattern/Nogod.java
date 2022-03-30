package strategyPattern;

public class Nogod implements IPayment{

    @Override
    public void pay() {
        System.out.println("payed with Nogod");
    }
}
