package assignment.design.bird.factory;

import assignment.design.bird.entities.*;
import assignment.design.bird.flyingStratergy.BirdType;
import assignment.design.bird.flyingStratergy.Flying;

public class BirdCreationFatory {

    private static Bird bird;

    public static Bird getFlyingBird(BirdType birdType, String colour, Integer height, Integer width, Flying flying) {

        if(birdType == BirdType.Parrot){
            bird = new Parrot(colour,height,width,flying);
        } else if(birdType == BirdType.Crow) {
            bird = new Crow(colour,height,width,flying);
        } else if(birdType == BirdType.Owly){
            bird = new Owl(colour,height,width,flying);
        } else if(birdType == BirdType.Sparrow){
            bird = new Sparrow(colour,height,width,flying);
        }
        return bird;
    }


    public static Bird getNonFlyingBird(BirdType birdType, String colour, Integer height, Integer width) {

        if(birdType == BirdType.Penguin){
            bird = new Penguin(colour,height,width);
        }
        return bird;
    }
}
