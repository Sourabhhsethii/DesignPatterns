package learning.patterns.observer;

/*
  MY first observer pattern !!!
 */
public class Cli {
    public static void main(String[] args) {
        // Create Producer Class First
        Amazon a = Amazon.getInstance();
        // Create Consumer Class.
        Order o = new Order();
        Email e = new Email();
        SMS s = new SMS();
        // Send the Events!!
        a.sendEvent();
    }
}
