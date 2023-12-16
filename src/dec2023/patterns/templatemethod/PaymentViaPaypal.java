package dec2023.patterns.templatemethod;

public class PaymentViaPaypal extends PaymentTemplate{

    @Override
    public void paymentExecution() {
        System.out.println("Payment Implemented VIA Paypal Execution Method");
    }
}
