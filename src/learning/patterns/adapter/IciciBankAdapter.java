package learning.patterns.adapter;

/**
 * Adapter class calling Icici bank Implementation
 */
public class IciciBankAdapter implements BankAdapter{

    IciciBank iciciBank = new IciciBank();

    @Override
    public void pay() {
        iciciBank.pay();
    }

    @Override
    public void checkBalance() {
        iciciBank.checkBalance();
    }
}
