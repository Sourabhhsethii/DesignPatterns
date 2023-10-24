package learning.patterns.solid.bird.birdv4;

import java.util.ArrayList;
import java.util.List;

/**
 * ISP -> Interface Should be as light as possible.
 * As less no of methods as possible -> Ideally One.
 * <<List>> Interface as add, remove, length, sort -> all methods are logically related!!
 * <<Stack>> Interface as all methods like push(), pop(), peek() are logically related!!
 */
public class Client {

    public static void main(String[] args) {
        List<BirdV4> bird = new ArrayList<>();
        bird.add(new Crow());
        bird.add(new Pengiun());
        bird.add(new Sparrow());
        bird.add(new Parrot());

        for (BirdV4 b : bird){
            b.fly();
        }

    }
}
