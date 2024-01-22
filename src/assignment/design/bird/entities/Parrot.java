package assignment.design.bird.entities;

import assignment.design.bird.flyingStratergy.BirdType;
import assignment.design.bird.flyingStratergy.Flying;

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
