package learning.patterns.observer;

public class SMS implements OrderPlacerEvent{

    public SMS(){
        Amazon a = Amazon.getInstance();
        a.register(this);
    }

    @Override
    public void executeOrder() {
        System.out.println("SMS Send!!");
    }
}
