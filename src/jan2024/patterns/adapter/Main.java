package jan2024.patterns.adapter;

public class Main {

    public static void main(String[] args) {

        Payment payment = PaymentPracticalFactory.getFactoryObject("bofa");
        payment.pay();

        payment = PaymentPracticalFactory.getFactoryObject("chase");
        payment.pay();
    }

}
