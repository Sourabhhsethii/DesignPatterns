package learning.patterns.adapter;

/**
 * Client Constructor Doing DI
 */
public class Client {

    private BankAdapter bankAdapter;

    public Client(BankAdapter adapter){
        this.bankAdapter = adapter;
    }

    public void pay(){
        bankAdapter.pay();
    }

    public void checkBalance(){
        bankAdapter.checkBalance();
    }

}
