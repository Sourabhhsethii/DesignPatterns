package learning.patterns.observer;

public class Email implements OrderPlacerEvent{

    public Email(){
        Amazon a = Amazon.getInstance();
        a.register(this);
    }

    @Override
    public void executeOrder() {
        System.out.println("Email Send!!");
    }
}
