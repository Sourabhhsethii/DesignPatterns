package assignment.design.bird.fly;


/**
 * This class is the concrete class of Flying Behaviour !!
 */
public class CrowOwlyFlyingStyle implements Flying {
    @Override
    public void makeFly(BirdType birdType) {
        System.out.println("I am Crow Owl Flying Style" + birdType);
    }
}
