package jan2024.patterns.command.problem;

public class Button {

    private String label;

    public void click(){
        //... Click has to do many things !!!!
        //... Which Design Principle will be applied?
        //... PolyMorphic -> Polymorphic interface!!
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
