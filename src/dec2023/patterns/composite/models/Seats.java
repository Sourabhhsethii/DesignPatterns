package dec2023.patterns.composite.models;

public class Seats implements Payment{

    private int id;
    private int amount;

    public Seats(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public PaymentEvent execute() {
        return new PaymentEvent(id,amount);
    }
}
