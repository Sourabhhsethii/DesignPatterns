package assignment.design.bird.entities;

import assignment.design.bird.flyingStratergy.BirdType;
import assignment.design.bird.flyingStratergy.Flying;

public class Crow extends Bird {

    Flying flying;

    public Crow(String colour, Integer height, Integer width, Flying flying) {
        super(colour, height, width);
        this.flying = flying;
    }

    /**
     * makeFly method is implementing DIP. makeFly method is dependent upon FLying interface -> Instead
     */
    public void letsFly() {
        flying.makeFly(BirdType.Crow);
    }
}
