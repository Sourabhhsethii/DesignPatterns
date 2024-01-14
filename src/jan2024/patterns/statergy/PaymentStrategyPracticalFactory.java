package jan2024.patterns.statergy;

/**
 * Object Creation Responsibility with the CLass
 */
public class PaymentStrategyPracticalFactory {

    PaymentStrategy paymentStrategy;

    PaymentStrategy paymentFactory(String bank){

        if(bank.equalsIgnoreCase("icic")){
            paymentStrategy = new ICICIBank();
        } else if (bank.equalsIgnoreCase("idfc")){
            paymentStrategy = new IdfcBank();
        }
        return paymentStrategy;
    }
}
