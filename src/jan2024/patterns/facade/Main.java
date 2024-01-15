package jan2024.patterns.facade;

public class Main {
    public static void main(String[] args) {

        /**
         * Clean Facade!! With Constructor based injection
         */
        PaymentFacade paymentFacade = new PaymentFacade(new Funds(), new Pay());
        System.out.println(paymentFacade.pay("sourabh",1000));
    }
}
