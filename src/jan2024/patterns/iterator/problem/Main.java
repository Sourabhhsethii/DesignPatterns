package jan2024.patterns.iterator.problem;

/**
 * This call will break if the need to change the implementation details of the List in BrowseHistory
 * Change done in BrowseHistory will impact the Main Class.
 */
public class Main {
    public static void main(String[] args) {

        var history = new BrowseHistory();
        history.push("URL1");
        history.push("URL2");
        history.push("URL3");

        for (int i = 0; i < history.getUrls().size(); i++) {
           var urls = history.getUrls().get(i);
            System.out.println(urls);
        }
    }
}
