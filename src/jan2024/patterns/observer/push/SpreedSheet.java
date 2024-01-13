package jan2024.patterns.observer.push;

public class SpreedSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet Got notified!!" + value);
    }
}
