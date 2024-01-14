package jan2024.patterns.mediator.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class UiControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler obs){
        eventHandlers.add(obs);
    }

    protected void notifyHandler(){
        for (var obs: eventHandlers)
            obs.handle();
    }
}
