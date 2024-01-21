package assignment.design.pen.entities;

public class Body {

    private String colour;
    private int length;
    private int width;

    public Body(String colour, int length, int width) {
        this.colour = colour;
        this.length = length;
        this.width = width;
    }

    public String getColour() {
        return colour;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
