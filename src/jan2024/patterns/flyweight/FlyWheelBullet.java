package jan2024.patterns.flyweight;

public class FlyWheelBullet {
    private String radius;
    private String curve;

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getCurve() {
        return curve;
    }

    public void setCurve(String curve) {
        this.curve = curve;
    }

    @Override
    public String toString() {
        return "FlyWheelBullet{" +
                "radius='" + radius + '\'' +
                ", curve='" + curve + '\'' +
                '}';
    }
}
