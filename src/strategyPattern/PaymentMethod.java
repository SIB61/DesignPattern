package strategyPattern;

import java.lang.reflect.Method;

public class PaymentMethod {
    public IPayment getPaymentMethod(PaymentMethods method){
        IPayment iPayment;
        switch (method){
            case Bkash -> {
                iPayment= new Bkash();
            }
            case Nogod -> {
                iPayment=new Nogod();
            }
            case NexusPay -> {
                iPayment=new NexusPay();
            }
            default -> {
                iPayment = null;
            }
        }
        return iPayment;
    }
}
