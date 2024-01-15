package jan2024.patterns.adapter;

public class PaymentPracticalFactory {

    /**
     * Lazy Creations!!
     */
    private static Payment payment = null;

    public static Payment getFactoryObject(String bank){

        if(bank.equalsIgnoreCase("chase")){
            payment = new ChaseBankAdapter(new ChaseBank());
        } else if(bank.equalsIgnoreCase("bofa")){
            payment = new BOFAAdapter(new BOFA());
        }
        return payment;
    }

}
