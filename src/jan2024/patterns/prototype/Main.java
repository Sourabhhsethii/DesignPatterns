package jan2024.patterns.prototype;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Registry !!
        HashMap<Class,Object> register = new HashMap<>();
        var paymentEvent = new PaymentEvent("1245","ICICIBank","Sourabh Test");
        register.put(PaymentEvent.class,paymentEvent);

        // Clone Payment!!
        PaymentEvent paymentEventToClone = (PaymentEvent) register.get(PaymentEvent.class);
        var clonedPaymentEvent = paymentEventToClone.clone();
        System.out.println(clonedPaymentEvent.getBankName());
        System.out.println(clonedPaymentEvent.getPaymentEventId());

        var payment = new Payment("123","IDFC First Bank","Sourabh Test",1);
        register.put(Payment.class,payment);
        Payment paymentCloned = (Payment) register.get(Payment.class);
        System.out.println(paymentCloned.getBankName());
        System.out.println(paymentCloned.getPaymentId());

    }
}
