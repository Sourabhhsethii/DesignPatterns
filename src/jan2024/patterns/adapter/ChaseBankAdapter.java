package jan2024.patterns.adapter;

public class ChaseBankAdapter implements Payment {

    ChaseBank chaseBank;

    public ChaseBankAdapter(ChaseBank chaseBank) {
        this.chaseBank = chaseBank;
    }

    @Override
    public void pay() {
        System.out.println("Paying Through ChaseBankAdapter ");
        chaseBank.payThroughMe();
    }
}
