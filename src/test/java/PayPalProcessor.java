public class PayPalProcessor implements PaymentProcessor{
    @Override
    public void process(double amount) {
        System.out.println("Payment is being processed by PayPal. Amount: " + amount);
    }
}
