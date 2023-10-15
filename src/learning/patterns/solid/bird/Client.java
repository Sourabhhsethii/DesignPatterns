package learning.patterns.solid.bird;

public class Client {

    public static void main(String[] args) {
        // Too many responsibility by Bird Class. It Violates SRP.
        BirdV0 birdV0 = new BirdV0(2,1,"test",true);
        birdV0.setType("pigeon");
        // fly method has if-else condition which Violates SRP. It has too many responsibility.
        System.out.println("testing is the bird can fly? " +birdV0.fly());
    }
}
