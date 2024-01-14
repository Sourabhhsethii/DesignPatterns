package jan2024.patterns.singleton;

/**
 * Singleton Object create single object & return same object again & again!!
 */
public class Main {

    public static void main(String[] args) {
        Executor executor = Executor.getInstance();
        executor.setA("Test SingleTon");
        System.out.println(executor.getA());

        System.out.println(executor);

        /**
         * Second time calling it.
         */
        Executor executor2 = Executor.getInstance();
        System.out.println(executor2.getA());
        System.out.println(executor2);
    }
}
