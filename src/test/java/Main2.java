public class Main2 {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentProcessor payPalProcessor = new PayPalProcessor();
        PaymentService.executePayment(creditCardProcessor, 100.0);
        PaymentService.executePayment(payPalProcessor, 150.0);
    }
}
