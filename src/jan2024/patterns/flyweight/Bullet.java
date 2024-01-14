package jan2024.patterns.flyweight;

/**
 * Intrusive Properties of Bullet in Bullet object
 */
public class Bullet {
    /**
     * Extrusive Properties of Bullet in flyWheelBullet object
     */
    private FlyWheelBullet flyWheelBullet;
    private String bulletName;
    private String bulletNo;

    public FlyWheelBullet getFlyWheelBullet() {
        return flyWheelBullet;
    }

    public void setFlyWheelBullet(FlyWheelBullet flyWheelBullet) {
        this.flyWheelBullet = flyWheelBullet;
    }

    public String getBulletName() {
        return bulletName;
    }

    public void setBulletName(String bulletName) {
        this.bulletName = bulletName;
    }

    public String getBulletNo() {
        return bulletNo;
    }

    public void setBulletNo(String bulletNo) {
        this.bulletNo = bulletNo;
    }
}
