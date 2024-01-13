package jan2024.patterns.observer.pull;

public class SpreedSheet implements Observer{
    private DataSource dataSource;

    public SpreedSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Update the SpreedSheet!!" + dataSource.getValue());
    }
}
