package jan2024.patterns.observer.push;

public class DataSource extends Observable {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        noitfyObservers(value);
    }
}
