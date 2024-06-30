package june2024.patterns.bhevarial.decorator.pizza;

public class DefaultVeggies extends Ingredient {

    Ingredient ingredient;

    public DefaultVeggies(Ingredient ingredient) {
        this.ingredient = ingredient;
    }


    @Override
    String getDesc() {
        String text = "";
        if(ingredient != null) {
            text = ingredient.getDesc() + " + Added DefaultVeggies on top of it " ;
        } else {
            text = "Added Cheese";
        }
        return text;
    }

    @Override
    Integer getCost() {
        Integer cost =  0;
        if(ingredient != null) {
            cost = ingredient.getCost() + 5 ;
        } else {
            cost = 5;
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "ingredient=" + ingredient +
                '}';
    }


}
