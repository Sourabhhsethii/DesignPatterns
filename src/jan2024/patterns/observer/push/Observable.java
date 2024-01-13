package jan2024.patterns.observer.push;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void noitfyObservers(int value){
        for (var obs: observers)
            obs.update(value);
    }

}
