package jan2024.patterns.statergy;

public class ICICIBank implements PaymentStrategy {

    @Override
    public boolean pay(int amount) {
        System.out.println("Paid VIA " + amount + " ICICI Bank");
        return false;
    }
}
