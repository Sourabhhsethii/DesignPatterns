package dec2023.patterns.proxy.model;


public class PaymentEvent {

    private int id;
    private String referenceComments;

    public PaymentEvent(int id, String referenceComments) {
        this.id = id;
        this.referenceComments = referenceComments;
    }

    public int getId() {
        return id;
    }

    public String getReferenceComments() {
        return referenceComments;
    }
}
