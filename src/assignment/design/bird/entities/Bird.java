package assignment.design.bird.entities;

/**
 * Bird is the central abstract entity
 */
public abstract class Bird {
    String colour;
    Integer height;
    Integer width;

    public Bird(String colour, Integer height, Integer width) {
        this.colour = colour;
        this.height = height;
        this.width = width;
    }

    public String getColour() {
        return colour;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }
}
