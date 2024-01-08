package jan2024.patterns.iterator.solution;

public class Main {

    public static void main(String[] args) {
        var history = new BroweHistory();

        history.push("URL1");
        history.push("URL2");
        history.push("URL3");

        var itr = history.createIterator();
        while (itr.hasNext()){
            System.out.println(itr.current());
            itr.next();
        }
    }
}
