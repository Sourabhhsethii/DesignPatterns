package assignment.design.bird.entities;

import assignment.design.bird.fly.BirdType;
import assignment.design.bird.fly.Flying;

public class Parrot extends Bird {
    Flying flying;

    public Parrot(String colour, Integer height, Integer width, Flying flying) {
        super(colour, height, width);
        this.flying = flying;
    }

    public void letsFly() {
        flying.makeFly(BirdType.Parrot);
    }
}
