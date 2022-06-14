package factoryPattern;


public class NexusPay implements IPayment {

    @Override
    public void pay() {
        System.out.println("payed with NexusPay");
    }
}
