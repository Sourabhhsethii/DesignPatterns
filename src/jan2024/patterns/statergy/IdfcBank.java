package jan2024.patterns.statergy;

public class IdfcBank implements PaymentStrategy {
    @Override
    public boolean pay(int amount) {
        System.out.println("Paid VIA " + amount + " IDFC First Bank");
        return false;
    }
}
