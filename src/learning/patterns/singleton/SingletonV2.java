package learning.patterns.singleton;

public class SingletonV2 {

    private static SingletonV2 instance = null;

    private static void SingletonV2(){}

    public static SingletonV2 getInstance(SingletonV2 singletonV2){
        if(instance == null ) { // Double Checking is required because two threads can enter at the same time.
            synchronized(singletonV2){
                if(instance == null) { // Double Checking because one thread can enter at this time.
                    instance = singletonV2; // Creation of Object.
                }
            }
        }
        return instance;
    }
}
