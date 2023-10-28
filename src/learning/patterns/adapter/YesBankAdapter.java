package learning.patterns.adapter;

/**
 *  Yes Bank Adapter class calling Yes bank Implementation
 */
public class YesBankAdapter implements BankAdapter{

    private YesBank yesBank = new YesBank();

    @Override
    public void pay() {
        yesBank.pay();
    }

    @Override
    public void checkBalance() {
        yesBank.checkBalance();
    }
}
