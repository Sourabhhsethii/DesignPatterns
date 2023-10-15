package learning.patterns.singleton;

/*
Ask your Question To Yourself
How to make any class Singleton?

One & Only One object Creation.

1.) Make the constructor Private & Static first so that No one create Object of that Class.
2.) Have private static instance variable to get create object with new keyword.
3.) Have another public static method which will check the if the in instance == null, create & return new object of the class, else return the already have instance;
4.) To Solve Concurrent Issues if the thread, code for double check & add Sync block while creating object/
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private static void Singleton(){}

    public static Singleton getInstance(){
        if(instance == null ) { // Double Checking is required because two threads can enter at the same time.
            synchronized(instance){
                if(instance == null) { // Double Checking because one thread can enter at this time.
                    return new Singleton(); // Creation of Object.
                }
            }
        }
        return instance;
    }

}
