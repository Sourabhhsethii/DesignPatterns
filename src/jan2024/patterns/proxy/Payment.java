package jan2024.patterns.proxy;

public class Payment implements Pay {

    private int payment;

    public void pay(int payment){
        this.payment = payment;
        System.out.println("Paid amount : " + payment);
    }
}
