package dec2023.patterns.composite.models;

public class Wheel implements Payment{
    int id;
    int amount;

    public Wheel(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public PaymentEvent execute() {
        return new PaymentEvent(id,amount);
    }
}
