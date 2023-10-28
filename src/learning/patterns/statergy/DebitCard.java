package learning.patterns.statergy;

public class DebitCard implements PaymentStrategy {
    @Override
    public void pay(Integer amt) {
        System.out.println("Amount through Debit Card " + amt);
    }
}
