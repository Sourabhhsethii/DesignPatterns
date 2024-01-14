package jan2024.patterns.proxy;

public class PaymentProxyVaiSubClassing extends Payment {

    private Payment payment = new Payment();

    @Override
    public void pay(int payment) {
        System.out.println("Intercepting Payment : Started : Via SubClassing");
        System.out.println("Intercepting Payment : Txn Started  : Via SubClassing");
        this.payment.pay(payment);
        System.out.println("Intercepting Payment : Txn Completed  : Via SubClassing");
        System.out.println("Intercepting Payment : Stopped  : Via SubClassing");
    }
}
