package jan2024.patterns.observer.pull;

public class Main {
    public static void main(String[] args) {
        ///////////////////////////////////
        /// PULL Based Communication /////
        //////////////////////////////////
        var ds = new DataSource();
        var sp = new SpreedSheet(ds);
        var ch = new Chart(ds);
        ds.setValue(1);
        ds.addObservers(sp);
        ds.addObservers(ch);
        ds.notifyObserver();
        ///////////////////////////////////
        /// PULL Based Communication /////
        //////////////////////////////////
    }
}
