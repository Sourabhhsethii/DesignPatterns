package learning.patterns.facade.before;

public class Cli {
    public static void main(String[] args) {
        Amazon a = new Amazon(new OrderPlacer());
        a.orderPlaced();
    }
}
