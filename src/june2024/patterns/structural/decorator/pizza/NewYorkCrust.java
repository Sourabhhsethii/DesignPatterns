package june2024.patterns.structural.decorator.pizza;

public class NewYorkCrust extends Ingredient {

    Ingredient ingredient;

    public NewYorkCrust(){
    }

    public NewYorkCrust(Ingredient ingredient) {
        this.ingredient = ingredient;
    }


    @Override
    String getDesc() {
        String text = "";
        if(ingredient != null) {
            text = ingredient.getDesc() + " + Added NewYorkCrust " ;
        } else {
            text = "Added NewYorkCrust";
        }
        return text;
    }

    @Override
    Integer getCost() {
        Integer cost =  0;
        if(ingredient != null) {
            cost = ingredient.getCost() + 20 ;
        } else {
            cost = 20;
        }
        return cost;
    }

    @Override
    public String toString() {
        return "NewYorkCrust{" +
                "ingredient=" + ingredient +
                '}';
    }
}
