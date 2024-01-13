package jan2024.patterns.observer.pull;

public class Chart implements Observer {

    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Updated Charts" + dataSource.getValue());
    }
}
