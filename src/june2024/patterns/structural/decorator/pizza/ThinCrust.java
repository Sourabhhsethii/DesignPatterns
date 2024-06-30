package june2024.patterns.structural.decorator.pizza;

public class ThinCrust extends Ingredient {

    Ingredient ingredient;

    public ThinCrust(){
    }

    public ThinCrust(Ingredient ingredient) {
        this.ingredient = ingredient;
    }


    @Override
    String getDesc() {
        String text = "";
        if(ingredient != null) {
            text = ingredient.getDesc() + " + Added ThinCrust " ;
        } else {
            text = "Added ThinCrust";
        }
        return text;
    }

    @Override
    Integer getCost() {
        Integer cost =  0;
        if(ingredient != null) {
            cost = ingredient.getCost() + 10 ;
        } else {
            cost = 10;
        }
        return cost;
    }

    @Override
    public String toString() {
        return "ThinCrust{" +
                "ingredient=" + ingredient +
                '}';
    }
}
