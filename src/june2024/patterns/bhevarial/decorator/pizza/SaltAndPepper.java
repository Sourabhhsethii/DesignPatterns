package june2024.patterns.bhevarial.decorator.pizza;

public class SaltAndPepper extends Ingredient {

    Ingredient ingredient;

    public SaltAndPepper(Ingredient ingredient) {
        this.ingredient = ingredient;
    }


    @Override
    String getDesc() {
        String text = "";
        if(ingredient != null) {
            text = ingredient.getDesc() + " + Added SaltAndPepper on top of it " ;
        } else {
            text = "Added SaltAndPepper";
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
