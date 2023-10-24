package learning.patterns.solid.bird;

import learning.patterns.solid.bird.birdv0.BirdV0;
import learning.patterns.solid.bird.birdv1.Bird1;
import learning.patterns.solid.bird.birdv1.Crow;

public class Client {

    public static void main(String[] args) {
        // Too many responsibility by Bird Class. It Violates SRP.
        BirdV0 birdV0 = new BirdV0(2,1,"test",true);
        birdV0.setType("pigeon");
        // fly method has if-else condition which Violates SRP. It has too many responsibility.
        System.out.println("testing is the bird can fly? " +birdV0.fly());
        // Too Many - If else in client Code hence violation  of OCP.
        // If Multiple if/else is part of the logic then it's not part of
        if (birdV0.getType() == "pigeon"){
            // return pigeon;
        } else if(birdV0.getType() == "pigeon"){
            // return sparrow.
        }
    }
}
