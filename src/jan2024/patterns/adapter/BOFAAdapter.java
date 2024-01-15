package jan2024.patterns.adapter;

public class BOFAAdapter implements Payment {

    BOFA bofa;

    public BOFAAdapter(BOFA bofa) {
        this.bofa = bofa;
    }

    @Override
    public void pay() {
        System.out.println("Paying Through BOFAAdapter ");
        bofa.sendAmount();
    }
}
