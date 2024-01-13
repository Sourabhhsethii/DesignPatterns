package jan2024.patterns.observer.pull;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    List<Observer> observers = new ArrayList<>();

    void addObservers(Observer observer){
        observers.add(observer);
    }

    void removerObserver(Observer observer){
        observers.remove(observer);
    }

    void notifyObserver(){
        for (var obs: observers)
            obs.update();
    }

}
