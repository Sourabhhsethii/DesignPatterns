package learning.patterns.observer;

public class Order implements OrderPlacerEvent {

    public Order(){
        Amazon a = Amazon.getInstance();
        a.register(this);
    }

    @Override
    public void executeOrder() {
        System.out.println("Order Executed!!");
    }
}
