package learning.patterns.flyweight.before;

import java.util.List;
import java.util.Objects;

/**
 * It have both intrinsic(Value of the object remain same at all object/time) & extrinsic(Value of the object change with time) properties!!
 *  Bullet becomes heavy it contains both intrinsic & extrinsic properties.
 *
 */
public class Bullet {

    int size;
    int radius;
    String colour;
    float weight;
    List<Double> direction;
    int maxRange;
    int speed;
    List<Double> currentCoordinate;
    List<Double> targetCoordinate;
    Objects Image;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public List<Double> getDirection() {
        return direction;
    }

    public void setDirection(List<Double> direction) {
        this.direction = direction;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<Double> getCurrentCoordinate() {
        return currentCoordinate;
    }

    public void setCurrentCoordinate(List<Double> currentCoordinate) {
        this.currentCoordinate = currentCoordinate;
    }

    public List<Double> getTargetCoordinate() {
        return targetCoordinate;
    }

    public void setTargetCoordinate(List<Double> targetCoordinate) {
        this.targetCoordinate = targetCoordinate;
    }

    public Objects getImage() {
        return Image;
    }

    public void setImage(Objects image) {
        Image = image;
    }
}
