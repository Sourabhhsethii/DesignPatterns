package learning.patterns.solid.bird.birdv3;

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
        List<Eatable> bird = new ArrayList<>();
        bird.add(new Crow());
        bird.add(new Pengiun());
        bird.add(new Sparrow());

        for (Eatable b : bird){
            b.eat();
        }

        List<Flyable> flyingBird = new ArrayList<>();
        flyingBird.add(new Crow());
        flyingBird.add(new Sparrow());

        for (Flyable b : flyingBird){
            b.fly();
        }

        List<NonFlyable> nonFlyables = new ArrayList<>();
        nonFlyables.add(new Pengiun());

        for(NonFlyable nf : nonFlyables){
            nf.cantfly();
        }
    }
}
