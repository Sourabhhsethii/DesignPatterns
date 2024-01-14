package jan2024.patterns.prototype;

public class PaymentEvent implements Cloneable {
    private String paymentEventId;
    private String bankName;
    private String productName;

    public PaymentEvent(String paymentId, String bankName, String productName) {
        this.paymentEventId = paymentId;
        this.bankName = bankName;
        this.productName = productName;
    }

    public PaymentEvent(PaymentEvent event){
        this.paymentEventId = event.paymentEventId;
        this.bankName = event.bankName;
        this.productName = event.productName;
    }

    /**
     * Clone Method return the cloned Object;
     * @return
     */
    public PaymentEvent clone(){
        return new PaymentEvent(this);
    }

    public String getPaymentEventId() {
        return paymentEventId;
    }

    public String getBankName() {
        return bankName;
    }

    public String getProductName() {
        return productName;
    }
}
