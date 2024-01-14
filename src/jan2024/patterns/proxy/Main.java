package jan2024.patterns.proxy;

public class Main {
    public static void main(String[] args) {

        System.out.println("solution 1");
        Pay payment = new PaymentProxyVaiInterface();
        payment.pay(10);

        System.out.println("solution 2");

        PaymentProxyVaiSubClassing paymentProxyVaiSubClassing = new PaymentProxyVaiSubClassing();
        paymentProxyVaiSubClassing.pay(20);
    }
}
