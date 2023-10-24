package learning.patterns.solid.bird.birdv1;

public class Client {
    public static void main(String[] args) {
        // Version 1 of Bird.
        // SRP & OCP compatible code.
        // Extensible -> To add new Bird, just add new class with the type.
        // SRP -> Bird is only responsible for Genric things. Each bird type with be responsible for specific implemenation.
        Bird1 test = new Crow();
        test.fly();

        Bird1 test2 = new Owl();
        test2.fly();

        Bird1 test3 = new Sparrow();
        test3.fly();
    }
}
