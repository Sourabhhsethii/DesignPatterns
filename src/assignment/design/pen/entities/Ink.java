package assignment.design.pen.entities;

import org.w3c.dom.ls.LSInput;

import java.util.List;

public class Ink {
    private String colour;
    private String material;
    public List<PenFeatures> penFeatures;

    public Ink(String colour, String material, List<PenFeatures> penFeatures ) {
        this.colour = colour;
        this.material = material;
        this.penFeatures = penFeatures;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }
}
