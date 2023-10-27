package learning.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private static Amazon instance = new Amazon();
    List<OrderPlacerEvent> orderPlacerEvent = new ArrayList<>();

    private Amazon(){
    }

    // SingleTone Object
    public static Amazon getInstance(){
        // Double Checking for edge Cases
        if (instance == null){
            // Making It thread Safe!!
            synchronized (instance){
                if (instance == null)
                instance = new Amazon();
            }
        }
        return instance;
    }

    public void register(OrderPlacerEvent e){
        orderPlacerEvent.add(e);
    }

    public void sendEvent(){
        for (OrderPlacerEvent o: orderPlacerEvent){
            o.executeOrder();
        }
    }
}
