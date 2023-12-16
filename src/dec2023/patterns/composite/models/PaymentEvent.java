package dec2023.patterns.composite.models;

public class PaymentEvent {
    int id;



    int amount;

    public PaymentEvent(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }
}
