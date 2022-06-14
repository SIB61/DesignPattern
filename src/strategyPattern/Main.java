package strategyPattern;

public class Main {
    public static void main(String[] args) {
       IPayment iPayment;

       iPayment = new Bkash();
       iPayment.pay();

       iPayment = new Nogod();
       iPayment.pay();

       iPayment = new NexusPay();
       iPayment.pay();

    }
}
