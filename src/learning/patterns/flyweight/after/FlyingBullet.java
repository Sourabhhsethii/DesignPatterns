package learning.patterns.flyweight.after;

import java.util.List;

/**
 * FlyingBullet -> extrinsic(Value of the object change with time) properties
 * & Refernce of the Bullt is added here, it will reduce the size alot.
 */
public class FlyingBullet {

    List<Double> direction;
    int speed;
    List<Double> currentCoordinate;
    List<Double> targetCoordinate;
    Bullet bullet; // Reference to bullet object required the size of FlyingBullet as

    public List<Double> getDirection() {
        return direction;
    }

    public void setDirection(List<Double> direction) {
        this.direction = direction;
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

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
