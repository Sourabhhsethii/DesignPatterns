package learning.patterns.facade.after;

public class Cli {
    public static void main(String[] args) {
        new Amazon(new OrderPlacerFacade(new OrderPlacer())).orderPlaced();
    }
}
