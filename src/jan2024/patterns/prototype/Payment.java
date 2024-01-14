package jan2024.patterns.prototype;

public class Payment extends PaymentEvent implements Cloneable {

    private int paymentId;


    public Payment(String paymentEventId, String bankName, String productName, int paymentId) {
        super(paymentEventId, bankName, productName);
        this.paymentId = paymentId;
    }

    public Payment(Payment event) {
        super(event);
        this.paymentId = event.paymentId;
    }

    public Payment clone(){
        return new Payment(this);
    }

    public int getPaymentId() {
        return paymentId;
    }
}
