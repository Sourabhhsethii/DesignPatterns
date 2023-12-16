package dec2023.patterns.composite;

import dec2023.patterns.composite.models.Payment;
import dec2023.patterns.composite.models.PaymentEvent;

import java.util.ArrayList;

public class CompositeCar implements Payment {

    ArrayList<Payment> payments =  new ArrayList<>();
    int total;

    void add(Payment payment){
        payments.add(payment);
    }

    void remove(Payment payment){
        payments.remove(payment);
    }

    ArrayList<Payment> getPayments(){
        return payments;
    }

    @Override
    public PaymentEvent execute() {
        total = payments.stream().map(payment -> payment.execute().getAmount()).reduce(0,(a,b)-> a+b).intValue();
        return new PaymentEvent(1,total);
    }

    public int getTotal() {
        return total;
    }
}
