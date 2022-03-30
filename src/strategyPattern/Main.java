package strategyPattern;

public class Main {
    public static void main(String[] args) {
       IPayment iPayment;

        iPayment= new PaymentMethod().getPaymentMethod(PaymentMethods.NexusPay);
        iPayment.pay();

        iPayment= new PaymentMethod().getPaymentMethod(PaymentMethods.Bkash);
        iPayment.pay();

        iPayment= new PaymentMethod().getPaymentMethod(PaymentMethods.Nogod);
        iPayment.pay();

    }
}
