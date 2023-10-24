package learning.patterns.solid.bird.birdv2;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<BirdV2> bird = new ArrayList<>();
        bird.add(new Crow());
        bird.add(new Pengiun());
        bird.add(new Sparrow());

        for (BirdV2 b : bird){
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
