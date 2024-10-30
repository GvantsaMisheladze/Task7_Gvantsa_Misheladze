public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public void process(double amount) {
        System.out.println("Payment is being processed by Credit Card. Amount: " + amount);
    }
}
