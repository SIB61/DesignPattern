package factoryPattern;

public class Main {
    public static void main(String[] args) {
       IPayment iPayment;
       iPayment= new PaymentFactory().getPaymentMethod(PaymentMethods.Nogod);
       iPayment.pay();

       iPayment=new PaymentFactory().getPaymentMethod(PaymentMethods.Bkash);
       iPayment.pay();

       iPayment=new PaymentFactory().getPaymentMethod(PaymentMethods.NexusPay);
       iPayment.pay();

    }
}
