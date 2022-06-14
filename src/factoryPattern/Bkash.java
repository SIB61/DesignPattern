package factoryPattern;


public class Bkash implements IPayment {

    @Override
    public void pay() {
        System.out.println("payed with Bkash");
    }
}
