package learning.patterns.statergy;

public class Wires implements PaymentStrategy {
    @Override
    public void pay(Integer amt) {
        System.out.println("Paid through Wires " + amt);
    }
}
