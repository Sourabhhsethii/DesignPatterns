package dec2023.patterns.templatemethod;

import dec2023.patterns.proxy.Payment;

public class Main {
    public static void main(String[] args) {
        PaymentTemplate paymentTemplate = new PaymentViaPaypal();
        paymentTemplate.execute();

        paymentTemplate = new PaymentViaStripe();
        paymentTemplate.execute();
    }
}
