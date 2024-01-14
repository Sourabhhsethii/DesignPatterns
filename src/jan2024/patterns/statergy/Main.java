package jan2024.patterns.statergy;

public class Main {

    public static void main(String[] args) {
         var paymentStrategyPracticalFactory = new PaymentStrategyPracticalFactory();
         var paymentStrategy =  paymentStrategyPracticalFactory.paymentFactory("idfc");
         paymentStrategy.pay(10);
         paymentStrategy = paymentStrategyPracticalFactory.paymentFactory("icic");
         paymentStrategy.pay(20);


    }
}
