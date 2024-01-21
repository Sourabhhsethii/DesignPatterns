package assignment.design.pen.entities;

public class Ink {
    private String colour;
    private String material;

    public Ink(String colour, String material) {
        this.colour = colour;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }
}
