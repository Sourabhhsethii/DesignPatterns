package jan2024.patterns.singleton;

import java.util.concurrent.ExecutorService;

public class Executor {
    /**
     * Executor Service make it Lazy Creation
     */
    private static Executor executorService = null;
    private static Object monitor = new Object();
    private String a;

    /**
     *  Make Class SingleTon
     */
    private Executor(){}

    /**
     * Make Static method to return the instance of the class
     */
    public static Executor getInstance() {

        /**
         * if two threads comes inside it.
         */
        if(executorService == null){

            /**
             * synchronized on monitor object;
             */
           synchronized(monitor){
               /**
                * Double Checking
                */
               if(executorService == null){
                   executorService = new Executor();
               }
           }

        }

        return executorService;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
