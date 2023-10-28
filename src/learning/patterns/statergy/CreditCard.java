package learning.patterns.statergy;

public class CreditCard implements PaymentStrategy {
    @Override
    public void pay(Integer amt) {
        System.out.println("Paid through CreditCard " + amt);
    }
}
