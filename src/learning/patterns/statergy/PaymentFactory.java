package learning.patterns.statergy;

/*
  Practical Factory
 */
public class PaymentFactory {

    PaymentStrategy payMethod(PaymentMode mode) {

        PaymentStrategy paymentStrategy = null;
        if(mode == PaymentMode.WIRES){
            paymentStrategy = new Wires();
        } else if (mode == PaymentMode.DEBIT_CARD) {
            paymentStrategy = new DebitCard();
        } else if(mode == PaymentMode.CREDIT_CARD){
            paymentStrategy = new CreditCard();
        }
        return paymentStrategy;
    }

}
