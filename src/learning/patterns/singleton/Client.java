package learning.patterns.singleton;

public class Client {

    public static void main(String[] args) {
        var singleton = Singleton.getInstance();
        var singletonV2 = SingletonV2.getInstance(new SingletonV2());
        System.out.println("Hey! Singleton is created!! " + singleton);
        System.out.println("Hey! Singleton is created!! " + singletonV2);
    }
}
