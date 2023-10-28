package learning.patterns.statergy;

public class Cli {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        paymentFactory.payMethod(PaymentMode.CREDIT_CARD).pay(10);
        paymentFactory.payMethod(PaymentMode.DEBIT_CARD).pay(9);
        paymentFactory.payMethod(PaymentMode.WIRES).pay(20);
    }
}
