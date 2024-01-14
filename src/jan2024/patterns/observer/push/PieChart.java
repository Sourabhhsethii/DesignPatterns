package jan2024.patterns.observer.push;

public class PieChart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Chart Got handle!!" + value);
    }
}