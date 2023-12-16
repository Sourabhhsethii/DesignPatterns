package dec2023.patterns.templatemethod;

public class PaymentViaStripe extends PaymentTemplate{
    @Override
    public void paymentExecution() {
        System.out.println("Payment Implemented VIA Stripe Execution Method");
    }
}
