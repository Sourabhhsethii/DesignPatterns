package jan2024.patterns.proxy;

public class PaymentProxyVaiInterface implements Pay {

    private Payment payment = new Payment();

    @Override
    public void pay(int payment) {
        System.out.println("Intercepting Payment : Started : InterfaceProxy");
        System.out.println("Intercepting Payment : Txn Started : InterfaceProxy");
        this.payment.pay(payment);
        System.out.println("Intercepting Payment : Txn Completed : InterfaceProxy");
        System.out.println("Intercepting Payment : Stopped : InterfaceProxy");
    }
}
