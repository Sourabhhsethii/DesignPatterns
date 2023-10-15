package learning.patterns.solid.bird;

/*
   Lets Design a Bird Using SOLID Principle
   It's Violates first SRP principle, It's doing lot of things together.
   Here Bird is responsible for How every bird will perform behaviors.
 */
public class BirdV0 {

    private int weight;
    private int colour;
    private String type;
    private String name;
    private boolean canFly;


    public BirdV0(int weight, int colour, String name, boolean canFly){
        this.weight = weight;
        this.colour = colour;
        this.name = name;
        this.canFly = canFly;
    }

    public boolean fly() {

        if(type == "sparrow"){
            return true;
        } else if(type == "crow"){
            return true;
        } else if (type == "pigeon"){
            return false;
        }
        return false;
    }

    public void canEat(){

    }
    public void canWalk(){

    }

    public void setType(String type) {
        this.type = type;
    }
}
